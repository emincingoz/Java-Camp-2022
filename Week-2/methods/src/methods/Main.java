package methods;

public class Main {
	public static void main(String[] args) {
        sayiBulmaca();

    }
	
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMý = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                varMý = true;
                break;
            }
        }
//        if (varMý) {
//            mesajVer(aranacak);
//        } else {
//            System.out.println("Sayý Mevcut Deðildir : "+aranacak);
//        }
//    }
//    // parametreli metot
//    public static void mesajVer (int aranacak) {
//        System.out.println("Sayý Mevcuttur : " + aranacak);
//    }
        String mesaj= " ";
        String mesaj2= " ";
        if (varMý){
            mesaj = "Sayý mevcuttur : "+ aranacak;
            mesajVer(mesaj);
        }else {
            mesaj2 = "Sayý mevcut deðildir : " + aranacak;
            mesajVer(mesaj2);
        }
    }
    
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
