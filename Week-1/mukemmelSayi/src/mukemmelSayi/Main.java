package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 28, total = 0;

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println(number + " is a perfect number.");
		}else
			System.out.println(number + " is not a perfect number.");
	}

}
