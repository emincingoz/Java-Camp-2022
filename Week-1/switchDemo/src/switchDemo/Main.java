package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'a';

		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("M�kemmel : Ge�tiniz.");
				break;
	
			case 'B':
			case 'b':
				System.out.println("�ok g�zel : Ge�tiniz.");
				break;
	
			case 'C':
			case 'c':
				System.out.println("�yi : Ge�tiniz.");
				break;
	
			case 'D':
			case 'd':
				System.out.println("Fena de�il : Ge�tiniz.");
				break;
			case 'F':
			case 'f':
				System.out.println("Maalesef Kald�n�z.");
				break;
			default:
				System.out.println("Ge�ersiz not girdiniz.");
		}
	}

}
