
package mealcost;

import java.util.Scanner;

public class total_meal_cost {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cost of the meal");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println("Enter tip percentage");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.println("Enter tax percentage");
        int taxPercent = scan.nextInt(); // tax percentage
        
        double tip = (mealCost *((double)tipPercent/100)); //calculating tip amount
        double tax = (mealCost*((double)taxPercent/100)); //calculating tax amount
        double total= (mealCost+tip+tax); //calculating total amount

        System.out.println("The total meal cost is "+total+" INR");
	}
}
