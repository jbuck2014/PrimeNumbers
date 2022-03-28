import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberGeneratorImplTest {

    PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

    @Test
    public void isPrimeNegativeTest() {
        assertFalse(primeNumberGenerator.isPrime(-1));
    }

    @Test
    public void isPrimeNegativeTest2() {
        assertFalse(primeNumberGenerator.isPrime(-999999));
    }

    @Test
    public void isPrimeZeroTest() {
        assertFalse(primeNumberGenerator.isPrime(0));
    }

    @Test
    public void isPrimeOneTest() {
        assertFalse(primeNumberGenerator.isPrime(1));
    }

    @Test
    public void isPrimeTwoTest() {
        assertTrue(primeNumberGenerator.isPrime(2));
    }

    @Test
    public void isPrimeThreeTest() {
        assertTrue(primeNumberGenerator.isPrime(3));
    }


    @Test
    public void isPrimeFourTest() {
        assertFalse(primeNumberGenerator.isPrime(4));
    }

    @Test
    public void isPrimeFiveTest() {
        assertTrue(primeNumberGenerator.isPrime(5));
    }

    @Test
    public void isPrimeNineTest() {
        assertFalse(primeNumberGenerator.isPrime(9));
    }

    @Test
    public void isPrime100Test() {
        assertFalse(primeNumberGenerator.isPrime(100));
    }

    @Test
    public void isPrime101Test() {
        assertTrue(primeNumberGenerator.isPrime(101));
    }



    @Test
    public void generateTestNone() {
        List<Integer> primeList = primeNumberGenerator.generate(-999,1);
        assertEquals(0, primeList.size());
    }


    @Test
    public void generateTestOneToTen() {
        List<Integer> primeList = primeNumberGenerator.generate(1,10);
        assertEquals(4, primeList.size());
        assertTrue(primeList.contains(2));
        assertTrue(primeList.contains(3));
        assertTrue(primeList.contains(5));
        assertTrue(primeList.contains(7));
    }

    @Test
    public void generateTestTenToOne() {
        List<Integer> primeList = primeNumberGenerator.generate(10,1);
        assertEquals(4, primeList.size());
        assertTrue(primeList.contains(2));
        assertTrue(primeList.contains(3));
        assertTrue(primeList.contains(5));
        assertTrue(primeList.contains(7));
    }

    @Test
    public void generateTestLarge() {
        List<Integer> primeList = primeNumberGenerator.generate(7900,7920);
        assertEquals(3, primeList.size());
        assertTrue(primeList.contains(7901));
        assertTrue(primeList.contains(7907));
        assertTrue(primeList.contains(7919));
    }
}
