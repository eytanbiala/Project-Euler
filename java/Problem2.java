public class Problem2 {

	public static void main(String[] args) {

		int sum = 0;
		int current = 1;
		int next = 2;

		while (current <= 4000000) {
			if (current % 2 == 0) {
				sum += current;
			}

			int nextTemp = next;
			next = current + next;
			current = nextTemp;
		}

		System.out.println("Total: " + sum);
	}
}
