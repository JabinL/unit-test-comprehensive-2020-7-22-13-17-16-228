package game;

public class NumberGenerator implements Generator{

    @Override
    public int[] generateNumbers() {
        int size = 4;
        int max = 9;
        int min = 0;
        
        int[] answer = new int[size];
        int count = 0;
        while(count < size) {
            int number = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                if(number == answer[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer[count] = number;
                count++;
            }
        }
        return answer;
    }
}
