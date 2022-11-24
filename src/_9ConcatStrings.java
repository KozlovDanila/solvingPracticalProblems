import java.util.List;
import java.util.StringJoiner;

public class _9ConcatStrings {

	public static void main(String[] args) {
		List<String> strings = List.of("First string", "Second string", "Third string");

//        Мое решение
//        String result = String.join(" ", strings);
//        strings.stream().collect(Collectors.joining(" "));

//        Решение из книги 1
//		StringBuilder builder = new StringBuilder();
//		for (int i = 0; i < strings.size(); i++) {
//			builder.append(strings.get(i)).append(" ");
//		}
//		builder.append(strings.get(strings.size() - 1));
//		String result = builder.toString();

//        Решение из книги 2
		StringJoiner joiner = new StringJoiner(" ");
		for (String str : strings) {
			joiner.add(str);
		}
		String result = joiner.toString();
	}
}
