public class _1CountRepeatingChars {

	public static void main(String[] args) {
		String str = "Подсчет повторяющихся символов. Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.";
//		1
//		Map<Character, Integer> result = new HashMap<>();
//		for (char value : str.toCharArray()) {
//			Integer i = result.get(value);
//			if (i == null) {
//				i = 0;
//			}
//			i++;
//			result.put(value, i);
//		}
//		System.out.println(result);

//		2
//		Map<Character, Integer> result = new HashMap<>();
//		for (char value : str.toCharArray()) {
//			result.compute(value, (k, v) -> (v == null) ? 1 : ++v);
//		}
//		System.out.println(result);

//		3
//		Map<Character, Long> result = str
//				.chars()
//				.mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//		System.out.println(result);

	}
}
