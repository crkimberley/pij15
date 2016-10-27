/**
 * @author crkimberley on 27/10/2016.
 */
public class Hierarchy {
    public static void main(String[] args) {
        new Hierarchy().launch();
    }

    private void launch() {
        ClassA a = new ClassC();
        try {
            a.someMethod();
        } catch(Level1Exception ex1) {
            System.out.println("Caught Level1Exception");
        }
    }
}
