public class _4OnlyNumbers {

	public static void main(String[] args) {
		if (isOnlyNumbers("0123456789")) {
			System.out.println("Только цифры");
		} else {
			System.out.println("Есть не цифры");
		}
	}

	//Моё решение
//	static boolean isOnlyNumbers(String str) {
//		return str.chars()
//				.filter(v -> v < '0' || v > '9')
//				.count() == 0;
//	}
//
//	//Решение из книги 1
//	static boolean isOnlyNumbers(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			if (!Character.isDigit(str.charAt(i))) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	//Решение из книги 2
//	static boolean isOnlyNumbers(String str) {
//		return str.chars().anyMatch(v -> !Character.isDigit(v));
//	}

	//Решение из книги 3
	static boolean isOnlyNumbers(String str) {
		return str.matches("[0-9]+");
	}
}
