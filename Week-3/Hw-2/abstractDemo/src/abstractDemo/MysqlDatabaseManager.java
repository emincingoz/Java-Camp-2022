package abstractDemo;

public class MysqlDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Mysql veritabanưna eklendi.");
	}
	@Override
	public void remove() {
		System.out.println("Mysql veritabanưndan silindi.");	
	}
	@Override
	public void update() {
		System.out.println("Mysql veritabanưnda güncellendi.");
	}
	@Override
	public void get() {
		System.out.println("Mysql veritabanưndan getirlildi.");
	}

}
