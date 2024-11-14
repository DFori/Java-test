import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {
    @Test
    public void testIsPrime() {
        assertTrue(isPrime(7));
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