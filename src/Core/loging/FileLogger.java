package Core.loging;

public class FileLogger implements Logger{
    @Override
    public void Log(String data) {
        System.out.println("Dosyaya loglandı..." + data);
    }
}
