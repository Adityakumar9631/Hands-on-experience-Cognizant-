public class Logger {
    private static Logger instance;

    private Logger(){
        System.out.println("Logger instance is creadted");
    }

    public static Logger getIns(){
        if (instance==null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String m){
        System.out.println("LOG:" +m);
    }
}
