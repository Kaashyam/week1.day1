package week1.day1;

public class PositiveOrNegative {
	public static void main(String[] args) {
		int a = -40;
		if (a > 0) {
			System.out.println("The number is positive");
		} else if (a == 0) {
			System.out.println("The number is neither positive nor negative");
		} else {
			System.out.println("The number is negative");
			System.out.println("The number " + a + " is converted to " + Math.abs(a));
		}
	}

}
