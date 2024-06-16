import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add_TwoPositiveInts_ReturnsResult() {
        //Arrange
        Calculator calc = new Calculator();
        int result;

        //Act
        result = calc.add(1,2);

        //Assert
        Assertions.assertEquals(3,result);
    }

    @Test
    void add_TwoNegativeInts_ReturnsResult() {
        //Arrange
        Calculator calc = new Calculator();
        int result;

        //Act
        result = calc.add(-1,-2);

        //Assert
        Assertions.assertEquals(-3,result);
    }
}