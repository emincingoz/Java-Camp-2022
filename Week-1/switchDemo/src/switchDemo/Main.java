package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'a';

		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("Mükemmel : Geçtiniz.");
				break;
	
			case 'B':
			case 'b':
				System.out.println("Çok güzel : Geçtiniz.");
				break;
	
			case 'C':
			case 'c':
				System.out.println("Ýyi : Geçtiniz.");
				break;
	
			case 'D':
			case 'd':
				System.out.println("Fena deðil : Geçtiniz.");
				break;
			case 'F':
			case 'f':
				System.out.println("Maalesef Kaldýnýz.");
				break;
			default:
				System.out.println("Geçersiz not girdiniz.");
		}
	}

}
