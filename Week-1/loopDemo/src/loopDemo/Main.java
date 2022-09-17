package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		// for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti.");

		// while loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While d�ng�s� bitti.");

		// do-while loop
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While d�ng�s� bitti.");
	}

}
