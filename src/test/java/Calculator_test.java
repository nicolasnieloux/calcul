import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator_test {

@Test
    public void testAdd(){

   Calculator addition = new Calculator();

   int expected = 6;
   int actual = addition.add(4,2);
   Assertions.assertEquals(expected,actual);
}

    @Test
    public void testDiv(){

        Calculator addition = new Calculator();

        String expected = "division par zero impossible";
        String actual = addition.divise(4,0);
        Assertions.assertEquals(expected,actual);
    }



}
