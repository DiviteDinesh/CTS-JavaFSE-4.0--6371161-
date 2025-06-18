public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        // check object is intialized or not 
        System.out.println(singleton.toString());
        // intialize the object 
        System.out.println(singleton.getInstance());
        // again check for same
        System.out.println(singleton.toString());
        // try creating again 
        System.out.println(singleton.getInstance());
    }
}
