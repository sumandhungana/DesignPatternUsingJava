package demo.designpattern.creational.factory;

/**
 * @author suman dhungana
 */
public abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateRateBill(int units) {
        System.out.println("::>>" + units * rate);
    }
}
