package examplespractice.singletonthreading;

public class Singleton {
    private static Singleton SINGLE_INSTANCE = null;
    public static String x;
    private Singleton() {}
    public static Singleton getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (Singleton.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new Singleton();
                    x = "one Instance";
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}