import java.util.Scanner;

public class CaseStudy112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Welcome to Senja Coffee Shop! ---");

        int pricePerCup = 18000;
        int totalCups, payment, totalPrice, discount, totalPayment, change, less;
        
        System.out.print("Enter the number of cups: ");
        totalCups = input.nextInt();
        System.out.print("Enter the payment amount: ");
        payment = input.nextInt();

        totalPrice = pricePerCup * totalCups;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = ((int) (totalPrice * 0.1));
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total Payment: " + totalPayment);

        if (payment >= totalPayment) {
            change = payment - totalPrice;
            System.out.println("Change: " + change);
        } else {
            less = totalPayment - payment;
            System.out.println("Insufficient payment. You need to pay: " + less);
        }
        input.close();
    }
}
