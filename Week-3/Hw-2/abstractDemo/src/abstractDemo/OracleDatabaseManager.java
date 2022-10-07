package abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Oracle veritabanýna eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("Oracle veritabanýndan silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("Oracle veritabanýnda güncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("Oracle veritabanýndan getirildi.");	
	}
}
