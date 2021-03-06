package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameProcessTest {
    @Test
    public void should_return_failed_when_guess_given_result_1A0B() {

        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 5, 6, 7};
        RandomNumberGenerator randomNumberGenerator = mock(RandomNumberGenerator.class);
        when(randomNumberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(randomNumberGenerator);
        GameProcess gameProcess = new GameProcess(guessNumber);
        //when
        GameState gameState = gameProcess.guess(inputNumber);

        //then
        assertEquals("FAILED", gameState.getState());
    }

    @Test
    public void should_return_succeed_when_guess_given_result_4A0B() {

        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 2, 3, 4};
        RandomNumberGenerator randomNumberGenerator = mock(RandomNumberGenerator.class);
        when(randomNumberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(randomNumberGenerator);
        GameProcess gameProcess = new GameProcess(guessNumber);
        //when
        GameState gameState = gameProcess.guess(inputNumber);

        //then
        assertEquals("SUCCEED", gameState.getState());
    }

    @Test
    public void should_return_game_over_when_guess_6_times_given_result_1A0B() {

        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 5, 6, 7};
        RandomNumberGenerator RandomNumberGenerator = mock(RandomNumberGenerator.class);
        when(RandomNumberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(RandomNumberGenerator);
        GameProcess gameProcess = new GameProcess(guessNumber);
        gameProcess.setTimes(0);
        //when
        GameState gameState = gameProcess.guess(inputNumber);

        //then
        assertEquals("GAMEOVER", gameState.getState());
    }

    @Test
    public void should_return_succeed_when_guess_6_times_given_result_4A0B() {

        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumber = {1, 2, 3, 4};
        RandomNumberGenerator randomNumberGenerator = mock(RandomNumberGenerator.class);
        when(randomNumberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(randomNumberGenerator);
        GameProcess gameProcess = new GameProcess(guessNumber);
        gameProcess.setTimes(0);
        //when
        GameState gameState = gameProcess.guess(inputNumber);

        //then
        assertEquals("SUCCEED", gameState.getState());
    }


}
