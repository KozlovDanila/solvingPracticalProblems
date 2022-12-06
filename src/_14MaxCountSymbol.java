import java.util.Map;
import java.util.stream.Collectors;

public class _14MaxCountSymbol {

	public static void main(String[] args) {
		System.out.println(findCharMaxCountSymbol("aaaaaaaaaaaaaaaaaaabbccccdddddddddd"));
	}

	// Моё решение
//    static char findCharMaxCountSymbol(String str) {
//        Map<Character, Integer> symbolsCount = new HashMap<>();
//        int max = 0;
//        char result = 0;
//        for (char symbol : str.toCharArray()) {
//            Integer newValue = symbolsCount.compute(symbol, (k, v) -> (v == null ? 1 : ++v));
//            if (newValue > max) {
//                max = newValue;
//                result = symbol;
//            }
//        }
//        return result;
//    }

	// Решение из книги 1
//    static char findCharMaxCountSymbol(String str) {
//        Map<Character, Integer> symbolsCount = new HashMap<>();
//        for (char symbol : str.toCharArray()) {
//            symbolsCount.compute(symbol, (k, v) -> (v == null ? 1 : ++v));
//        }
//        Integer max = Collections.max(symbolsCount.values());
//
//        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
//            if (Objects.equals(entry.getValue(), max)) {
//                return entry.getKey();
//            }
//        }
//        return '0';
//    }

	// Решение из книги 2
	static char findCharMaxCountSymbol(String str) {
		return str.chars()
				.mapToObj(v -> (char) v)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse('0');
	}
}
