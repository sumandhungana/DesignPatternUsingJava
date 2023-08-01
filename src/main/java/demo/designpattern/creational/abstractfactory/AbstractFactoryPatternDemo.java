package demo.designpattern.creational.abstractfactory;

/**
 * @author suman dhungana
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape2 = shapeFactory1.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory1.getShape("SQUARE");
        shape3.draw();
    }
}
