package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
        System.out.println(mesaj);
        
        /*
		 * System.out.println("Eleman say�s�: " + mesaj.length());
		 * System.out.println("5.eleman: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("Ya�as�n!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler);
		 */

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
	}

}
