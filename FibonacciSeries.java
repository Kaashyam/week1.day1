package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		for (int i = 1; i <8; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(a);
		}

	}
}