public class SingletonTest {
     public static void main(String[] args) {

        Logger logger1 = Logger.getIns();
        Logger logger2 = Logger.getIns();
        Logger logger3 = Logger.getIns();

        logger1.log("Started");
        logger2.log("Logged In");
        logger3.log("Closed");

        System.out.println("\nCodes:");

        System.out.println("logger1 = " + logger1.hashCode());
        System.out.println("logger2 = " + logger2.hashCode());
        System.out.println("logger3 = " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nOnly ONE Logger instance exists.");
        } else {
            System.out.println("\nMultiple Logger instances exist.");
        }
    }
}
