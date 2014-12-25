public class Problem10 {

	public static boolean isPrime(long n) {
		if (n == 1) {
			return false;
		}

		long k = (long) Math.sqrt(n);
		for (long i = 2; i <= k; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		long target = 2000000;
		long sum = 0;

		for (long i = 1; i < target; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("Sum of all primes below " + target + " = " + sum);
	}
}
