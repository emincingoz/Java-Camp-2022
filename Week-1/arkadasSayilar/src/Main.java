
public class Main {
	
	public static void main(String[] args) {
		
		int num1 = 220;
		int num2 = 284;
		int sum1 = 0;
		int sum2 = 0;
	
		for (int i = 1; i <= num1/2; i++) {
			if (num1 % i == 0)
				sum1 += i;
			
		}
		
		for (int i = 1; i <= num2/2; i++) {
			if (num2 % i == 0)
				sum2 += i;
		}
		
		if(num1 == sum2 && num2 == sum1)
		{
			System.out.println(num1 + " and "+ num2 +" are friend numbers.");
		}
		else
		{
			System.out.println(num1 + " and "+ num2 +" are not friend numbers.");
		}
	}
}
