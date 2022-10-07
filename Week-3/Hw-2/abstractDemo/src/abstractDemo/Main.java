package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		customerManager.database = new OracleDatabaseManager();
		customerManager.database = new MysqlDatabaseManager();
		customerManager.getCustomer();
	}

}
