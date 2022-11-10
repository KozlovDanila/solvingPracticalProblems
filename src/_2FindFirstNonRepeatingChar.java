import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "Отыскание первого повторяющегося символа. Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.";

//		1
//		Set<Character> chars = new HashSet<>();
//		Character first = null;
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char value = str.charAt(i);
//			boolean addResult = chars.add(value);
//			if (addResult) {
//				first = value;
//			}
//		}
//		if (first == null) {
//			System.out.println("Нет неповторяющихся символов");
//		} else {
//			System.out.println(first);
//		}

//		2
		Map<Integer, Long> chars = str.codePoints()
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		int cp = chars.entrySet().stream()
				.filter(e -> e.getValue() == 1L)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse((int) Character.MIN_VALUE);

		System.out.println((char) cp);

	}
}
