package _1Arithmetic;

import java.util.stream.IntStream;

public class _10GenerateAllPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		permuteAndPrint("", str);
	}

	// Решение из книги 1 просто с печатью
//    static void permuteAndPrint(String prefix, String str) {
//        int n = str.length();
//
//        if (n == 0) {
//            System.out.println(prefix + " ");
//        } else {
//            for (int i = 0; i < n; i++) {
//                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
//            }
//        }
//    }

	// Решение из книги 2 с возвратом
//static Set<String> permuteAndPrint(String prefix, String str) {
//    Set<String> result = new HashSet<>();
//    int n = str.length();
//
//    if (n == 0) {
//        result.add(prefix);
//    } else {
//        for (int i = 0; i < n; i++) {
//            result.addAll(
//                    permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i))
//            );
//        }
//    }
//    return result;
//}

	// Решение из книги 3 с печатью в функциональном стиле
	static void permuteAndPrint(String prefix, String str) {
		int n = str.length();

		if (n == 0) {
			System.out.println(prefix + " ");
		} else {
			IntStream.range(0, n)
					.parallel().forEach(i -> permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));

		}
	}
}
