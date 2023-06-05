package _1Arithmetic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _2RemoveRepeatedSymbols {

	public static void main(String[] args) {
		System.out.println(removeRepeatedSymbols("abcacdf"));
	}

//    Мое решение. Но не многом не то, что требуется. Удаляет вообще все повторы.
//    Когда как нужно, чтобы только повторки удалились, а один символ остался.
//static String removeRepeatedSymbols(String str) {
//    Map<Character, Long> symbolsCounts = str.chars()
//            .mapToObj(v->(char)v)
//            .collect(Collectors.groupingBy(t -> t, Collectors.counting()));
//
//    StringBuilder builder = new StringBuilder();
//    for (int i = 0; i < str.length(); i++) {
//        char symbol = str.charAt(i);
//        if (symbolsCounts.get(symbol) == 1) {
//            builder.append(symbol);
//        }
//    }
//    return builder.toString();
//}

//    Решение из книги 1:
//static String removeRepeatedSymbols(String str) {
//    StringBuilder builder = new StringBuilder();
//    for (int i = 0; i < str.length(); i++) {
//        char symbol = str.charAt(i);
//        if (builder.indexOf(String.valueOf(symbol)) == -1) {
//            builder.append(symbol);
//        }
//    }
//    return builder.toString();
//}

	//    Решение из книги 2:
//    static String removeRepeatedSymbols(String str) {
//        StringBuilder builder = new StringBuilder();
//        Set<Character> hashSet = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            char symbol = str.charAt(i);
//            if (hashSet.add(symbol)) {
//                builder.append(symbol);
//            }
//        }
//        return builder.toString();
//    }

	//    Решение из книги 3
	static String removeRepeatedSymbols(String str) {
		return Arrays.stream(str.split(""))
				.distinct()
				.collect(Collectors.joining());
	}
}
