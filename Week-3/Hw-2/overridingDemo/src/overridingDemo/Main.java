package overridingDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] krediler = new BaseKrediManager[] {new Tar�mKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
		for(BaseKrediManager kredi : krediler) {
			System.out.println(kredi.hesapla(1000));
		}
	}

}
