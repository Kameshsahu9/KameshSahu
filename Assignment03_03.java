package in.third;

public class Assignment03_03 {
	public static void main(String[] args) {
		int intValue = 5;
		double doubleValue = 3.5;
		float floatValue = 2.5f;

		double result1 = intValue + doubleValue;
		float result2 = intValue + floatValue;
		double result3 = doubleValue * floatValue;

		System.out.println("Result of int + double: " + result1);
		System.out.println("Result of int + float: " + result2);
		System.out.println("Result of double * float: " + result3);
	}
}
