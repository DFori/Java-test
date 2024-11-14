import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    public void testIsPrime() {
        assertTrue(isPrime(1));
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(4));
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
