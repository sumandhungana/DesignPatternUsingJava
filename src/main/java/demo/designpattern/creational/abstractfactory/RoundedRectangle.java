package demo.designpattern.creational.abstractfactory;

/**
 * @author suman dhungana
 */
public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rounded rectangle");
    }
}
