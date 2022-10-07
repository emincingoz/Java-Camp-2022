package abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("SqlServer veritabanına eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("SqlServer veritabanından silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("SqlServer veritabanında güncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("SqlServer veritabanından getirildi.");	
	}
}
