package _1Arithmetic;

import java.util.regex.Pattern;

public class _16StringContainsSubString {

	public static void main(String[] args) {
		System.out.println(contains("abc", "ca"));
	}

//	Моё решение
//	static boolean contains(String main, String search) {
//		return main.contains(search);
//	}

//	Решение из книги на основе ругялрных выражений
	static boolean contains(String main, String search) {
		return main.matches("(?i).*" + Pattern.quote(search) + ".*");
	}
}
