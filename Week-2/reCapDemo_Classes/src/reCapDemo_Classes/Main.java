package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(4,2);
        System.out.println(sonuc);

        int sonuc1 = dortIslem.Cikar(4,2);
        System.out.println(sonuc1);

        int sonuc2 = dortIslem.Carp(4,2);
        System.out.println(sonuc2);

        int sonuc3 = dortIslem.Bol(4,2);
        System.out.println(sonuc3);
	}

}
