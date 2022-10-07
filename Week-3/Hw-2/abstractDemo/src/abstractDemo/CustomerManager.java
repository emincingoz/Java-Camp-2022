package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager database;
	
	public void getCustomer(){
		database.get();
	}
	public void addCustomer(){
		database.add();
	}
	public void removeCustomer(){
		database.remove();
	}
	public void updateCustomer(){
		database.update();
	}
}
