public class _7ConvetStringIntoNumber {

	public static void main(String[] args) {
		String number = "123";

		int intValue = Integer.parseInt(number);
		long longValue = Long.parseLong(number);
		float floatValue = Float.parseFloat(number);
		double doubleValue = Double.parseDouble(number);


		String str = "This is string";
		String stringWithoutSpaces = str.replaceAll(" ", "");
		System.out.println(stringWithoutSpaces);
	}
}
