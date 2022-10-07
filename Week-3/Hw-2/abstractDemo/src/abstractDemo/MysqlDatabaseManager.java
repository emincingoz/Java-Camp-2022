package abstractDemo;

public class MysqlDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Mysql veritaban�na eklendi.");
	}
	@Override
	public void remove() {
		System.out.println("Mysql veritaban�ndan silindi.");	
	}
	@Override
	public void update() {
		System.out.println("Mysql veritaban�nda g�ncellendi.");
	}
	@Override
	public void get() {
		System.out.println("Mysql veritaban�ndan getirlildi.");
	}

}
