package abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Oracle veritabanưna eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("Oracle veritabanưndan silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("Oracle veritabanưnda güncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("Oracle veritabanưndan getirildi.");	
	}
}
