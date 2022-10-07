package abstractDemo;

public class MysqlDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Mysql veritabanýna eklendi.");
	}
	@Override
	public void remove() {
		System.out.println("Mysql veritabanýndan silindi.");	
	}
	@Override
	public void update() {
		System.out.println("Mysql veritabanýnda güncellendi.");
	}
	@Override
	public void get() {
		System.out.println("Mysql veritabanýndan getirlildi.");
	}

}
