package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("M��teri eklendi.");
		baseLogger.log("log mesaj�");
	}
}
