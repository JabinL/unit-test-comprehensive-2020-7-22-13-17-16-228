package game;

public class GameProcess {
    private GuessNumber guessNumber;
    public GameProcess(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    public GameState guess(int[] inpputNumber) {
        if(!guessNumber.guess(inpputNumber).equals("4A0B")){
            return new GameState("FAILED");
        }
        return new GameState("SUCCEED");
    }
}
