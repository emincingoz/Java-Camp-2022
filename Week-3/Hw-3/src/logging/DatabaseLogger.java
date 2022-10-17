package logging;

public class DatabaseLogger implements Logger {
	@Override
    public void Log(String data) {
        System.out.println("Veritabanýna loglandý " );
    }
}
