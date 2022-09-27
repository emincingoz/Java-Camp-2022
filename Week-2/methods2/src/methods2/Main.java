package methods2;

public class Main {
	public static void main(String[] args) {
        String mesaj = "Bug�n hava �ok g�zel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(0,7);
        System.out.println(sayi);
        int toplam = topla2(1,2,3,4,5,6,7,8,9);
        System.out.println(toplam);
        // Burada substring bir �ey olu�turdu ve bize onu sonu� olarak verdi.
        // Ama void bize sonu� oalrak hi�bir �ey vermiyor sadece yap dedi�imiz i�i yap�yor.
    }
	
    public static void ekle(){
        System.out.println("Eklendi");

    }
    
    public static void sil(){
        System.out.println("Silindi.");

    }
    
    public static void guncelle(){
        System.out.println("G�ncellendi");

    }
    
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    
    public static int topla2(int... sayilar) {

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
    
    public static String sehirVer(){
        return "Antalya";
    }
}
