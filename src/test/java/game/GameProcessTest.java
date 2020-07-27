package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameProcessTest {
    @Test
    public void should_return_failed_when_guess_given_result_1A0B(){

        //given
        int[] answer = {1,2,3,4};
        int[] inputNumber = {1,5,6,7};
        NumberGenerator numberGenerator = mock(NumberGenerator.class);
        when(numberGenerator.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(numberGenerator);
        GameProcess gameProcess = new GameProcess(guessNumber);
        //when
        GameState gameState = gameProcess.guess();

        //then
        assertEquals("FAIlED",gameState.getState());
    }
}
