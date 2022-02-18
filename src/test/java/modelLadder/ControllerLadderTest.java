package modelLadder;

import controller.LadderController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllerLadderTest {
    LadderController controller;

    public ControllerLadderTest() {
    }

    @Test
    public void ValidateInput_3() {
        //Arrange
        String word = "3";
        //Act
        controller = new LadderController(word);
        var answer = controller.result;
        var answerExpected = CreateAnswer(3);
        //Assert
        Assertions.assertArrayEquals(answerExpected, answer);
    }

    @Test
    public void ValidateInput_6() {
        //Arrange
        String word = "6";
        //Act
        controller = new LadderController(word);
        var answer = controller.result;
        var answerExpected = CreateAnswer(6);
        //Assert
        Assertions.assertArrayEquals(answerExpected, answer);
    }

    private String[][] CreateAnswer(int value) {
        String[][] answer = new String[value][value];
        for (int i = 0; i < value; i++){
            for (int j = 0; j < value;j++){
                if(value - j == (i + 1))
                    answer[i][j] = "*";
                if(value - i <= (j + 1))
                    answer[i][j] = "*";
                else
                    answer[i][j] = " ";
            }
        }
        return answer;
    }
}
