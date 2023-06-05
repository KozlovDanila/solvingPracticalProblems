package _1Arithmetic;

import java.util.stream.Collectors;

public class _13RemoveSymbol {

    public static void main(String[] args) {
        System.out.println(removeSymbol("строкаока", 'а'));
    }

    //Моё решение
//    static String removeSymbol(String str, Character symbol) {
//        return str.replace(String.valueOf(symbol), "");
//    }

    // Решение из книги 1
//    static String removeSymbol(String str, Character symbol) {
//        return str.replaceAll(Pattern.quote(String.valueOf(symbol)), "");
//    }

    // Решение из книги 2
//    static String removeSymbol(String str, Character symbol) {
//        StringBuilder builder = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            if (c != symbol) {
//                builder.append(c);
//            }
//        }
//        return builder.toString();
//    }

    // Решение из книги 3
static String removeSymbol(String str, Character symbol) {
    return str.chars()
            .filter(v -> v != symbol)
            .mapToObj(v -> String.valueOf((char) v))
            .collect(Collectors.joining());
}
}
