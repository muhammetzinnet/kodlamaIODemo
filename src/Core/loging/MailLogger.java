package Core.loging;

public class MailLogger implements Logger{
    @Override
    public void Log(String data) {
        System.out.println("Mail ile loglandı..." + data);
    }
}
