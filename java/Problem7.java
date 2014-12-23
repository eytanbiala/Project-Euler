import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Problem7 {

	public static boolean isPrime(long n) {
		if (n == 2 || n == 3) {
			return true;
		}
    	// check if n is a multiple of 2
		if (n % 2 == 0) {
			return false;
		}

    	// if not, then just check the odds
		for (long i = 3; i*i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		int target = 10001;
		int primeCount = 0;
		int currentNum = 1;

		while (primeCount != target) {

			currentNum++;

			if (isPrime(currentNum)) {
				// System.out.println("prime number: " + currentNum);				
				primeCount++;
			}
		}

		System.out.println(target + "st prime number: " + currentNum);
	}
}
