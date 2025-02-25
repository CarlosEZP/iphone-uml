package src;

import java.util.Scanner;

public class Iphone{
    public static void main(String[] args) {
        boolean iphoneOn = true;
        System.out.println("Welcome to your Iphone!");
        Scanner sc = new Scanner(System.in);
        while(iphoneOn) {
            System.out.println("What you wanna do?");
            System.out.println("1 - Music");
            System.out.println("2 - Phone");
            System.out.println("3 - Internet");
            System.out.println("4 - Exit");
            int input = 0;
            do {
                input = sc.nextInt();
                if(input < 1 || input > 4)
                    System.out.println("Invalid Option! Try again.");
            }while (input < 1 || input > 4);

            if(input == 4)
                iphoneOn = false;
        }
    }
}