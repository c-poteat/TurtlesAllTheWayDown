import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GreatestCommonDenominatorTest {
    GreatestCommonDenominator gcd = new GreatestCommonDenominator();

    @Test
    public void gcd() {
        // Given
        int p = 3;
        int q = 6;
        int expected = 3;

        // When
        int actual = gcd.gcd(q, p);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcd2() {
        // Given
        int p = 3;
        int q = 6;
        int expected = 3;

        // When
        int actual = gcd.gcd2(q, p);

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void instantTimeComparison1() {
        GreatestCommonDenominator gcd = new GreatestCommonDenominator();
        Instant start = Instant.now();
        // Given
        int p1 = 3;
        int q1 = 6;
        int expected1 = 3;
        // When
        int actual1 = gcd.gcd2(q1, p1);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        // Then
        Assert.assertEquals(expected1, actual1);
        System.out.println(start);
        System.out.println(finish);
        System.out.println(timeElapsed);
    }
    @Test
    public void instantTimeComparison2() {
        GreatestCommonDenominator gcd = new GreatestCommonDenominator();
        Instant start = Instant.now();
        // Given
        int p2 = 14;
        int q2 = 210;
        int expected2 = 14;
        // When
        int actual2 = gcd.gcd(q2, p2);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        // Then
        Assert.assertEquals(expected2, actual2);
        System.out.println(start);
        System.out.println(finish);
        System.out.println(timeElapsed);
    }
}