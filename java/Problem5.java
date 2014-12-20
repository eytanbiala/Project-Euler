public class Problem5 {

	public static boolean isDivisibleWithNoRemainder(int input) {
		for (int i = 1; i <= 20; i++) {
			if (input % i != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int i = 1;
		while (true) {
			if (isDivisibleWithNoRemainder(i)) {
				System.out.println("Smallest multiple: " + i);
				break;
			}

			i++;
		}
	}
}
