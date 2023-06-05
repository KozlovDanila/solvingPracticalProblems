package _1Arithmetic;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _5VowelsAndConsonantsCounts {
	public static void main(String[] args) {

		String str = "This is string value";

		// Мое решение
		Set<String> vowels = Set.of("a", "e", "i", "o", "u");
		Map<Boolean, Long> collect = str.chars()
				.filter(Character::isAlphabetic)
				.boxed()
				.collect(Collectors.partitioningBy(v -> vowels.contains(Character.toString((char) v.intValue())), Collectors.counting()));
		System.out.println("Согласных " + collect.get(false));
		System.out.println("Гласных " + collect.get(true));


	}
}
