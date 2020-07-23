package game;

public class NumberGenerator implements Generator{
    @Override
    public int[] generate() {
        int n = 4;
        int max = 9;
        int min = 0;
        
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] answer = new int[n];
        int count = 0;
        while(count < n) {
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(num == answer[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer[count] = num;
                count++;
            }
        }
        return answer;
    }
}
