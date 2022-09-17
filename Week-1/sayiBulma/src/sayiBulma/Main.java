package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int searchingNumber = 1, flag = 0;

		for (int number : numbers) {
			if (number == searchingNumber) {
				flag = 1;
			}
		}
		
		if (flag == 0) 
		{
			System.out.println("Aranan sayi bulunamadý: " + searchingNumber);
		} else
			System.out.println("Aranan sayý bulundu: " + searchingNumber);
	}

}
