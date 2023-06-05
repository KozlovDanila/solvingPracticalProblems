package _1Arithmetic;

import java.util.regex.Pattern;

public class _17CountStringContainsSubString {


    public static void main(String[] args) {
        System.out.println(countStringContainsSubString("строкастрокастрстрокастр", "стр"));
    }

    //    Моё решение
//    static int countStringContainsSubString(String main, String search) {
//        int result = 0;
//        int i;
//        while ((i = main.indexOf(search)) != -1) {
//            result++;
//            main = main.substring(i + search.length());
//        }
//        return result;
//    }

    //    Решение из книги 1
//    static int countStringContainsSubString(String main, String search) {
//        int position = 0;
//        int count = 0;
//        int n = search.length();
//
//        while ((position = main.indexOf(search, position)) != -1) {
//            position = position + n;
//            count++;
//        }
//        return count;
//    }

    //    Решение из книги 2
static int countStringContainsSubString(String main, String search) {
    int result = main.split(Pattern.quote(search), -1).length - 1;
    return result < 0 ? 0 : result;
}
}
