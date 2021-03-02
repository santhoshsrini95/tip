package deb;

import java.util.Scanner;

public class tip {   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter meal_cost");
    int meal_cost=scanner.nextInt();
    double tip;
    double tax;
    double total_cost;
    System.out.println("Enter tip_percent");
    int tip_percent=scanner.nextInt();
    int tax_percent=(8);
    tip = (meal_cost /100) * (tip_percent);
    tax = (meal_cost/100 ) * (tax_percent);
    total_cost = (meal_cost + tip + tax);
    System.out.println(total_cost);//DFGEFEW
}
}

