package methods;

public class Main {
	public static void main(String[] args) {
        sayiBulmaca();

    }
	
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varM� = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                varM� = true;
                break;
            }
        }
//        if (varM�) {
//            mesajVer(aranacak);
//        } else {
//            System.out.println("Say� Mevcut De�ildir : "+aranacak);
//        }
//    }
//    // parametreli metot
//    public static void mesajVer (int aranacak) {
//        System.out.println("Say� Mevcuttur : " + aranacak);
//    }
        String mesaj= " ";
        String mesaj2= " ";
        if (varM�){
            mesaj = "Say� mevcuttur : "+ aranacak;
            mesajVer(mesaj);
        }else {
            mesaj2 = "Say� mevcut de�ildir : " + aranacak;
            mesajVer(mesaj2);
        }
    }
    
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
