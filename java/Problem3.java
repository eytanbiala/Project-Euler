public class Problem3 {

	public static boolean isPrime(long n) {
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
		long target = 600851475143L;
		long largestPrime = 1L;
		int sqrt = (int)Math.sqrt(target);

		for (long i = 1L; i < target; i++) {
			if (target % i == 0) {
				// is a factor
				if (isPrime(i)) {
					largestPrime = i;
				}
			}

			//	a factor cannot be greater than the square root
			if (i > sqrt) {
				break;
			}
		}

		System.out.println("Largest prime factor of " + target + " is " + largestPrime);
	}
}
