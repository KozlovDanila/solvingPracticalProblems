package _1Arithmetic;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _20ConcatStringNTimes {

    public static void main(String[] args) {
        System.out.println(concatNTimes("a", 5));
    }

    // Моё решение
//static String concatNTimes(String str, int count) {
//    StringBuilder builder = new StringBuilder();
//    for (int i = 0; i < count; i++) {
//        builder.append(str);
//    }
//    return builder.toString();
//    return str.repeat(count);
//}

//    // Решение из книги 3
//static String concatNTimes(String str, int count) {
//    return String.join(" ", Collections.nCopies(count, str));
//}

    // Решение из книги 4
static String concatNTimes(String str, int count) {
    return Stream.generate(()->str)
            .limit(count)
            .collect(Collectors.joining());
}
}
