package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 2;
		boolean isPrime = true;
		
		if(number < 1)
            System.out.println("Ge�ersiz say�..");
		
		if(number == 1) {
            System.out.println("Say� asal de�ildir");
            return;
        }
		
		for(int i = 2; i <= number / 2;i++) {
			if (number % i == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println(number + " say�s� asal say�d�r.");
		else
			System.out.println(number + " say�s� asal say� de�ildir.");
	}

}
