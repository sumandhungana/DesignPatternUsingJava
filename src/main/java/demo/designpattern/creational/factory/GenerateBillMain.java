package demo.designpattern.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author suman dhungana
 */
public class GenerateBillMain {
    public static void main(String[] args) {

        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName;
        {
            try {
                planName = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = 0;
        try {
            units = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateRateBill(units);
    }
}

