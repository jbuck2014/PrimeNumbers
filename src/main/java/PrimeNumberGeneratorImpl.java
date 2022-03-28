import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }

    @Override
    public boolean isPrime(int value) {
        boolean isPrime = true;
        if(value < 2) {
            return false;
        } else if (value == 2) {
            return true;
        } else if (value%2 == 0) {
            return false;
        } else {
            for(int i=2; i*i<=value; i++) {
                if(value%i == 0) {
                    return false;
                }
            }
        }
        return isPrime;
    }
}
