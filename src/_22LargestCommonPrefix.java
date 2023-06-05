public class _22LargestCommonPrefix {

	public static void main(String[] args) {
		String[] value = {"acbd", "acbdf", "acb", "acbcd"};
		String largestCommonPrefix = getLargestCommonPrefix(value);
		System.out.println(largestCommonPrefix);
	}

	private static String getLargestCommonPrefix(String[] value) {
		String start = value[0];
		for (String word : value) {
			for (int i = 0; i < word.length() && start.length() > i; i++) {
				if (start.charAt(i) != word.charAt(i)) {
					start = word.substring(0, i);
				}
			}
		}
		return start;
	}
}
