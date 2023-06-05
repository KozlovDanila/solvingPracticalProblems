public class _25To39 {

	public static void main(String[] args) {
		// Сложение двух крупных чисел типа long/int
		int z = Integer.MAX_VALUE + Integer.MAX_VALUE; // Вернет -2, а не то, что мы ожидаем
		z = Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE); // Кинет эксепшн ArithmeticException

		//27-39 какая-то дичь непонятно о чем
	}
}
