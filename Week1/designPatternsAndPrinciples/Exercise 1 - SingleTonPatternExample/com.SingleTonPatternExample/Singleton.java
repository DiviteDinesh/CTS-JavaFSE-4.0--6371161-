public class Singleton {
    private static Singleton singleton = null;
    private String message;
    public static Singleton getInstance(){
        if(singleton == null) {
            singleton = new Singleton();            
        }
        else System.out.print("Object Already created \t");
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override 
    public String toString(){
        return singleton == null ? "Object is not Yet created\n" : "Not Null \n";
    }
}
