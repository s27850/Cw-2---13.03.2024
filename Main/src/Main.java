import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 40;
        int discount = 0;

        System.out.println("Which city: ");
        String city = sc.next();

        System.out.println("What age: ");
        double age = sc.nextDouble();

        System.out.println("Which day: ");
        String dayOfWeek = sc.next();
        dayOfWeek.toUpperCase();

        System.out.println("Which day (number): ");
        int dayOfWeekNumber = sc.nextInt();


        if (age < 10) {
            //price = 0;
            discount = 100;
        } else if (age <= 18 && age >= 10) {
            //price *= 0.5;
            discount = 50;
        } else if (city.contains("Warsaw")) {
            //price *= 0.1;
            discount = 10;
        }
        if ((dayOfWeek.equals("czw")) || dayOfWeek.equals("czwartek") || (dayOfWeekNumber == 4)) {
            discount = 100;
            //price = 0;
        }

        int finalPrice;
        finalPrice = price - (price * (discount / 100));
        System.out.println("Data: " + city + ", " + age + " years old, weekday Ticket price: " + finalPrice + "PLN");
        System.out.println("Discount: " + discount + "%");
    }

}