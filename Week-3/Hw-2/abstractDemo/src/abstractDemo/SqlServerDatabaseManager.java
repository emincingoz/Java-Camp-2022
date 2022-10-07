package abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("SqlServer veritaban�na eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("SqlServer veritaban�ndan silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("SqlServer veritaban�nda g�ncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("SqlServer veritaban�ndan getirildi.");	
	}
}
