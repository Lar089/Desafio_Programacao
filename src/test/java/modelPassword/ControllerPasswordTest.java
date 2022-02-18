package modelPassword;

import controller.PasswordController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllerPasswordTest {
    PasswordController controller;

    @Test
    public void ValidateInput_Ya3(){
        //Arrange
        String password = "Ya3";
        //Act
        controller = new PasswordController(password);
        int answer = controller.resultFull;
        //Assert
        Assertions.assertEquals(3, answer);
    }

    @Test
    public void ValidateInput_00Ab(){
        //Arrange
        String password = "00Ab";
        //Act
        controller = new PasswordController(password);
        int answer = controller.resultFull;
        //Assert
        Assertions.assertEquals(2, answer);
    }

    @Test
    public void ValidateInput_aaaaa(){
        //Arrange
        String password = "aaaaa";
        //Act
        controller = new PasswordController(password);
        int answer = controller.resultFull;
        //Assert
        Assertions.assertEquals(3, answer);
    }
}
