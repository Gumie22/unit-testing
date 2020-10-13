import org.junit.Test;

import static org.junit.Assert.*;

public class testPrimeNumberMethodTest {

    @Test
    public void test() {
        int number = 290;
        PrimeNumberMethod prime = new PrimeNumberMethod(number);
        assertEquals(PrimeNumberMethod.isPrime(number), PrimeNumberMethod.isPrime(number));
        assertFalse(PrimeNumberMethod.isPrime(number) != PrimeNumberMethod.isPrime(number));
    }
    public boolean isPrime(int num){
        num = 100;
        boolean prime = false;
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                prime = true;
                break;
            }
            }
            return isPrime(num);
    }
}
