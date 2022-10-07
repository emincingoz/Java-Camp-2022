package polymorphismDemo;

public class MailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to mail " + message);
	}
}
