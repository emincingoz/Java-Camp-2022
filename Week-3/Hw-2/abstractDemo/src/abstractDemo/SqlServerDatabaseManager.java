package abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("SqlServer veritabanưna eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("SqlServer veritabanưndan silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("SqlServer veritabanưnda güncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("SqlServer veritabanưndan getirildi.");	
	}
}
