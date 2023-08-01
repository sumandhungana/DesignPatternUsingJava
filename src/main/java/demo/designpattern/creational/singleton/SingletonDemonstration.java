package demo.designpattern.creational.singleton;

/**
 * @author suman dhungana
 */
public class SingletonDemonstration {
    public static void main(String[] args) {
        //we cannot create new object of SingleObject Class here
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
