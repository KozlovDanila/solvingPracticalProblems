package _1Arithmetic;

import java.util.Arrays;
import java.util.Comparator;

public class _15SortingArrayStringsByLength {

    public static void main(String[] args) {
        String[] strs = {
                "fasdf1323423",
                "123",
                "213454",
                "1"
        };

        sortingArrayStringsByLength(strs);

        System.out.printf(Arrays.toString(strs));
    }

static String[] sortingArrayStringsByLength(String[] arr) {
   return Arrays.stream(arr)
           .sorted(Comparator.comparingInt(String::length))
           .toArray(String[]::new);
}
}
