package modelAnagram;

import controller.AnagramController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllerAnagramTest {
    AnagramController controller;

    @Test
    public void ValidateInput_ovo(){
        //Arrange
        String word = "ovo";
        //Act
        controller = new AnagramController(word);
        int answer = controller.result;
        //Assert
        Assertions.assertEquals(2, answer);
    }

    @Test
    public void ValidateInput_ifailuhkqq(){
        //Arrange
        String word = "ifailuhkqq";
        //Act
        controller = new AnagramController(word);
        int answer = controller.result;
        //Assert
        Assertions.assertEquals(3, answer);
    }

    @Test
    public void ValidateInput_banana(){
        //Arrange
        String word = "banana";
        //Act
        controller = new AnagramController(word);
        int answer = controller.result;
        //Assert
        Assertions.assertEquals(5, answer);
    }

    @Test
    public void ValidateInput_cara(){
        //Arrange
        String word = "cara";
        //Act
        controller = new AnagramController(word);
        int answer = controller.result;
        //Assert
        Assertions.assertEquals(2, answer);
    }
}
