package game;

public class GameProcess {
    private GuessNumber guessNumber;
    private int times = 6;
    public GameProcess(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    public GameState guess(int[] inpputNumber) {

        if(!guessNumber.guess(inpputNumber).equals("4A0B")&&getTimes()==0){
            return new GameState("GAMEOVER");
        }
        if(!guessNumber.guess(inpputNumber).equals("4A0B")){
            return new GameState("FAILED");
        }
        setTimes(getTimes()-1);
        return new GameState("SUCCEED");
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTimes(){
        return this.times;
    }
}
