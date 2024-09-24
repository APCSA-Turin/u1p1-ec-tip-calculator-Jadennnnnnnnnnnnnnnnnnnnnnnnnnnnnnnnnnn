package com.example.project;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        double totalTip = cost * ((double) percent / 100);
        double totalBill =  totalTip + cost;
        double costPerPerson = cost / people ;
        double tipPerPerson = totalTip / people;
        double finalCost = totalBill / people;

        DecimalFormat df = new DecimalFormat("0.00");
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + df.format(cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + df.format(totalTip) + "\n");
        result.append("Total Bill with tip: $" + df.format(totalBill) + "\n");
        result.append("Per person cost before tip: $" + df.format(costPerPerson) + "\n");
        result.append("Tip per person: $" + df.format(tipPerPerson) + "\n");
        result.append("Total cost per person: $" + df.format(finalCost) + "\n");
        result.append("-------------------------------\n");
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 2;
        int percent = 5;
        double cost = 29.56; 
        boolean quit = false;
        String items = ""; 
        Scanner scan = new Scanner(System.in);

        while (quit == false) {
            System.out.println("Enter an item name or type '-1' to finish:");
            String item = scan.nextLine();
            if (item.equals("-1")) { //https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java for string comparison
                quit = true;
            } else {
                items += item + "\n";
            }
        }
        
        scan.close();
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
