package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputNumberTest {
    @Test
    public void should_print_tip_when_inputNumber_length_is_not_equal_4() {
        //given
        int[] inputNumber = {3,3,2};
        Generator generator = new NumberGenerator();
        GuessNumber guessNumber = new GuessNumber(generator);

        //when
        boolean isValid = guessNumber.validInputNumber(inputNumber);
        //then
        assertEquals(false, isValid);
    }

    @Test
    public void should_print_tip_when_inputNumber_has_repeat_number() {
        //given
        int[] inputNumber = {0,1,1,4};
        Generator generator = new NumberGenerator();
        GuessNumber guessNumber = new GuessNumber(generator);

        //when
        boolean isValid = guessNumber.validInputNumber(inputNumber);
        //then
        assertEquals(false, isValid);
    }

}
