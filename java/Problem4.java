import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

	public static boolean isPalindrome(int input) {
		char[] originalString = String.valueOf(input).toCharArray();
		int length = originalString.length;

		char[] reverseString = new char[length];

		for (int i = length - 1; i >= 0; i--) {
			reverseString[length - 1 - i] = originalString[i];
		}

		for (int i = 0; i < length; i++) {
			if (reverseString[i] != originalString[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		List<Integer> palindromes = new ArrayList<Integer>();

		for (int i = 1000; i >= 100; i--) {
			for (int j = 1000; j >= 100; j--) {
				int product = i * j;
				if (isPalindrome(product)) {
					palindromes.add(product);
				}
			}
		}

		Collections.sort(palindromes);
		Integer lastPalindrome = palindromes.get(palindromes.size() - 1);
		System.out.println("Largest palindrome from the product of two 3-digit numbers = " + lastPalindrome);
	}
}
