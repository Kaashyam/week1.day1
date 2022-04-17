package week1.day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 153;
		int calculated = 0, remainder, original;
		original = a;
		while (original != 0) {
			remainder = original % 10;
			calculated = (int) Math.pow(remainder, 3);
			original /= 10;
		}
		if (calculated != original) {
			System.out.println(a + " is a armstrong number");
		} else {
			System.out.println(a + " is not a armstrong number");
		}
	}

}
