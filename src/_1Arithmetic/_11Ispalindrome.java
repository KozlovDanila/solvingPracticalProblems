package _1Arithmetic;

import java.util.stream.IntStream;

public class _11Ispalindrome {

	public static void main(String[] args) {
		String str = "довд";
		System.out.println(isPalindrome(str));
	}

	// Моё решение
//static boolean isPalindrome(String str) {
//    return new StringBuilder(str).reverse().toString().equals(str);
//}

	// Решение из киниги 1
//static boolean isPalindrome(String str) {
//    int length = str.length();
//    for (int i = 0; i < length / 2; i++) {
//        if (str.charAt(i) != str.charAt(length - i - 1)) {
//            return false;
//        }
//    }
//    return true;
//}

	// Решение из книги 3
	static boolean isPalindrome(String str) {
		return IntStream.range(0, str.length() / 2)
				.parallel()
                .noneMatch(v -> str.charAt(v) != str.charAt(str.length() - v - 1));
	}
}
