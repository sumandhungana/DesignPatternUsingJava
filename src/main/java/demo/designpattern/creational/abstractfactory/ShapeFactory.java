package demo.designpattern.creational.abstractfactory;

/**
 * @author suman dhungana
 */
public class ShapeFactory extends AbstractFactory {

    Shape getShape(String shapeType) {
        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
