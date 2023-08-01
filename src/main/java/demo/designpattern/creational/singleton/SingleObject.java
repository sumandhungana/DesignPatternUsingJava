package demo.designpattern.creational.singleton;

/**
 * @author suman dhungana
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("This is singleton Design Pattern Demonstration");
    }
}
