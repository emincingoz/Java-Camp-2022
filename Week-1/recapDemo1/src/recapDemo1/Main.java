package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 20, number2 = 25, number3 = 2;
		int enBuyukSayi = number1;
		
		
		if(enBuyukSayi < number2)
		{
			enBuyukSayi = number2;
	
		}
		if(enBuyukSayi < number3)
		{
			enBuyukSayi = number3;
	
		}
		
		System.out.println("En büyük sayı: " + enBuyukSayi);
	}

}
