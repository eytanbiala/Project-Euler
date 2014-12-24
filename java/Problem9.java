public class Problem9 {

	public static void main(String[] args) {

		int targetSum = 1000;
		int targetSumSqrt = (int)Math.sqrt(targetSum);
		int sum = 0;

		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int n = 1; n <= targetSumSqrt; n++) {
			for (int m = n + 1; m <= targetSumSqrt; m++) {

				a = m * m - n * n;
				b = 2 * m * n;
				c = m * m + n * n;
				
				sum = (a + b + c);
				if (sum == targetSum) {
					System.out.println("Pythagorean triplet: " + a + ", " + b + ", " + c);
					System.out.println("Sum: " + sum);
					System.out.println("Product: " + a * b * c);
					return;
				}
			}
		}
	}
}
