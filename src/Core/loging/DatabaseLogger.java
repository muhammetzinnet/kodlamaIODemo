package Core.loging;

public class DatabaseLogger implements Logger{
    @Override
    public void Log(String data) {
        System.out.println("Veritabanına loglandı.." + data);
    }
}
