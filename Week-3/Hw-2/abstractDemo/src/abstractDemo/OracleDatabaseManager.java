package abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager{
	@Override
	public void add() {
		System.out.println("Oracle veritaban�na eklendi.");		
	}
	
	@Override
	public void remove() {
		System.out.println("Oracle veritaban�ndan silindi.");	
	}
	
	@Override
	public void update() {
		System.out.println("Oracle veritaban�nda g�ncellendi.");	
	}
	
	@Override
	public void get() {
		System.out.println("Oracle veritaban�ndan getirildi.");	
	}
}
