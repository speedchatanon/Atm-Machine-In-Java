package com.atmmachine;

import java.util.*;
public class main {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        // We have to take an input by a user
        System.out.println("Enter your pin nummber");

        int password = scanner.nextInt();

        // code arrangment shif + alt + f
        if (password == pin) {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while(true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take resipt");
                System.out.println("Press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2 :
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        // 10000 = 100 + 10000
                        // balance = 10100
                        break;
                    case 3 :
                        System.out.println("How much Amout did you want to take ");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Your balance is insuffincient");
                            System.out.println("Try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                            // balance = 10100 = 10100 - 1000
                            // balance = 10000
                        }
                        break;
                    case 4 :
                        System.out.println("Welcome to All in One mmini ATM");
                        System.out.println("Avalable balance is " + balance);
                        System.out.println("Amount deposited    " + AddAmount);
                        System.out.println("Amount taken        " + TakeAmount);
                        System.out.println("Thanks from Coming!");
                    break;
                    default:
                        System.out.println("Press the number below 5");
                }
                if (opt == 5) {
                    System.out.println("Thank you!");
                    break;
                }
            }
        } else {
            System.out.println("Wrong pin number");
        }
    }
}
