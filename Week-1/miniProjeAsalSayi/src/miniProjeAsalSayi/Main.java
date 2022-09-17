package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 2;
		boolean isPrime = true;
		
		if(number < 1)
            System.out.println("Geçersiz sayý..");
		
		if(number == 1) {
            System.out.println("Sayý asal deðildir");
            return;
        }
		
		for(int i = 2; i <= number / 2;i++) {
			if (number % i == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println(number + " sayýsý asal sayýdýr.");
		else
			System.out.println(number + " sayýsý asal sayý deðildir.");
	}

}
