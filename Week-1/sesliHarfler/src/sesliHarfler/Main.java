package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'i';
		
		switch(harf) {
			case 'A':
			case 'a': 
			case 'I': 
			case '�': 
			case 'O': 
			case 'o': 
			case 'U': 
			case 'u': 
				System.out.println(harf + " kal�n sesli bir harftir.");
				break;
			
			case 'E':
			case 'e':
			case '�':
			case 'i':
			case '�':
			case '�':
			case '�':
			case '�':
				System.out.println(harf + " ince sesli bir harftir.");
				break;
			
			default:
				System.out.println("L�tfen sesli bir harf giriniz.");
			
		}
	}

}
