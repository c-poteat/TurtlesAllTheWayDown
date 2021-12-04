import org.junit.Assert;
import org.junit.Test;


public class FactorialTest {
    Factorial newFactorial = new Factorial();

    @Test
    public void factorialTestInt() {

        // Given
        int n = 9;
        int expected = 362880;

        // When
        int actual = newFactorial.factorialIntMethod(n);

        // Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void factorialTestLong() {
        // Given
        long n = 16;
        long expected = 20922789888000L;

        // When
        long actual = newFactorial.factorialLongMethod(n);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void factorialTestLongLoop() {
        // Given
        int n = 5;
        long expected = 120;

        // When
        long actual = newFactorial.factorialLongMethodLoop(n);

        // Then
        Assert.assertEquals(expected, actual);

    }
}