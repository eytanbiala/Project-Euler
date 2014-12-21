public class Problem6 {

	public static int findSumOfSquaresUpTo(int input) {
		int sum = 0;
		for (int i = 0; i <= input; i++) {
			sum += (int) Math.pow(i, 2);
		}

		return sum;
	}

	public static int findSquareOfSumUpTo(int input) {
		int sum = 0;
		for (int i = 0; i <= input; i++) {
			sum += i;
		}

		return ((int) Math.pow(sum, 2));
	}

	public static void main(String[] args) {

		int input = 100;
		int sumOfSquares = findSumOfSquaresUpTo(input);
		int squareOfSum = findSquareOfSumUpTo(input);
		int result = squareOfSum - sumOfSquares;

		System.out.println("Difference between sum of the squares of the first one hundred natural numbers and the square of the sum: " + result);
	}
}
