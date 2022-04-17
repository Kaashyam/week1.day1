package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 13;
		boolean isPrimeNumber = false;
		for (int i = 2; i <= a/2; i++) {
			if (a % i == 0) {
				isPrimeNumber = true;
				break;
			}

		}
		if (!isPrimeNumber) {
			System.out.println(a+ " is a prime number");
		} else {
			System.out.println(a+ " is not a prime number");
		}
	}

}