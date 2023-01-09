public class _19Anagramm {

	public static void main(String[] args) {
		System.out.println(isAnagramm("пуп", "упп"));
	}


	// Моё решение
//	static boolean isAnagramm(String first, String second) {
//	    char[] firstArray = first.replace(" ", "").toLowerCase().toCharArray();
//	    Arrays.sort(firstArray);
//
//	    char[] secondArray = second.replace(" ", "").toLowerCase().toCharArray();
//	    Arrays.sort(secondArray);
//
//	    return Objects.equals(new String(firstArray), new String(secondArray));
//	}

	// Решение из книги
	static boolean isAnagramm(String first, String second) {
		int[] chCounts = new int[256];
		char[] chStr1 = first.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] chStr2 = second.replaceAll("\\s", "").toLowerCase().toCharArray();

		if (chStr1.length != chStr2.length) {
			return false;
		}

		for (int i = 0; i < chStr1.length; i++) {
			chCounts[chStr1[i]]++;
			chCounts[chStr2[i]]--;
		}

		for (int chCount : chCounts) {
			if (chCount != 0) {
				return false;
			}
		}

		return true;
	}
}
