package _1Arithmetic;

public class _6SymbolCount {

	public static void main(String[] args) {
		System.out.println(countSymbolInString("this is string", 's'));
	}

//    Решение через циклы
//    static int countSymbolInString(String str, char symbol) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == symbol) {
//                count++;
//            }
//        }
//        return count;
//    }

	//    Решение через стримы
//    static long countSymbolInString(String str, char symbol) {
//        return str.chars().filter(v -> v == symbol)
//                .count();
//    }

	// Интересное решение из книги
	static long countSymbolInString(String str, char symbol) {
		return str.length() - str.replace(String.valueOf(symbol), "").length();
	}

}
