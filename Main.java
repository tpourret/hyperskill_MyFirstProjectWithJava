package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables for items sold at the shop
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;

        // Income calculation
        int income = bubblegum + toffee + doughnut + iceCream + milkChocolate + pancake;

        // Prints the item names, prices and total earnings
        System.out.printf(
                "Earned amount:\n" +
                "Bubblegum: $%d\n" +
                "Toffee: $%d\n" +
                "Ice Cream: $%d\n" +
                "Milk chocolate: $%d\n" +
                "Doughnut: $%d\n" +
                "Pancake: $%d\n\n" +
                "Income: $%d\n", bubblegum, toffee, iceCream, milkChocolate, doughnut, pancake, income
        );

        // Ask users for staff expenses, other expenses and calculate the net income.
        Scanner sc = new Scanner(System.in);
        int netIncome = 0;

        System.out.printf("Staff expenses:\n");
        int staffExpenses = sc.nextInt();
        System.out.printf("Other expenses:\n");
        int otherExpenses = sc.nextInt();
        netIncome = income - (staffExpenses + otherExpenses);
        System.out.printf("Net income: $%d\n", netIncome);
    }
}
