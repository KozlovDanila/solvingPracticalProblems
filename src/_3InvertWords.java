import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _3InvertWords {


    public static void main(String[] args) {
        // Моё решение
        String str = "Это какая-то строка";
//
//        StringBuilder result = new StringBuilder();
//        String[] words = str.split(" ");
//        for (String word : words) {
//            result.append(invert(word)).append(" ");
//        }
//
//        String newStr = result.toString();
//        System.out.println(newStr);

        // Решение из книги 2
//String result = Pattern.compile(" +")
//        .splitAsStream(str)
//        .map(w -> new StringBuilder(w).reverse())
//        .collect(Collectors.joining(" "));
//System.out.println(result);

	    //Ещё пара слов
	    System.out.println(new StringBuilder(str).reverse());
    }

    private static String invert(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
