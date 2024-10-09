package Week2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // 1.Create a program that asks the user for a password.
        // If the password is right, a secret message is shown to the user.
        /*while(true) {
            String password = "Akay";
            System.out.println("Enter password");
            String guess = reader.nextLine();
            if (guess.equals(password)) {
                System.out.println("The Secret is: Yes");
                break;
            }
            else {
                continue;
            }
        }*/

        // 2.Create a program that asks the user for three numbers and then prints their sum.
        /*System.out.println("Enter first number");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter third number");
        int num3 = Integer.parseInt(reader.nextLine());
        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);*/

        // 3.Create a program that reads numbers from the user and prints their sum.
        // The program should stop asking for numbers when the user enters the number 0.
        /*int sum = 0;
        while (true) {
            System.out.println("Enter number");
            int num = reader.nextInt();
            if (num == 0) {
                break;
            }
            else {
                sum += num;
            }

        }
        System.out.println(sum);*/

        // 4.Create a program that asks the user for the first number and the last number and
        // then prints all numbers between those two. Use a while loop.If the first number is greater than the last number,
        // the program prints those numbers.
        /*System.out.println("Enter first number");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter last number");
        int num2 = Integer.parseInt(reader.nextLine());
        if (num1 > num2) {
            System.out.println("First is greater than Last number");

        }
        num1++;
        while (num1 < num2) {
            System.out.println(num1);
            num1++;
        }*/

        // 5.Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user.
        // The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16.
        // In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power).
        // Note that the command returns a number of double types (i.e. floating point number).
        // A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
        // This assigns the value of 23 to the variable result.
        /*System.out.println("Enter number");
        int num = Integer.parseInt(reader.nextLine());
        int result = (int)Math.pow(2,num);
        System.out.println(result);*/

        // 6.Create a method printText that prints the following string of
        // characters: "In the beginning there were the swamp, the hoe and Java." and a line break.
        // Users should be able to enter how many times the text should be printed.
        /*System.out.println("How many times do you want it to be printed");
        int num = Integer.parseInt(reader.nextLine());
        printText(num);*/

        // 7.Create a method called drawStarsPiramid that will accept the number of rows as a
        // parameter and print a half pyramid shape where the number of rows will be dictated by the sent parameter.
        /*System.out.println("Enter number for pyramid");
        int num = Integer.parseInt(reader.nextLine());
        drawStarsPyramid(num);*/

        // 8.Write a program to print the inverted half pyramid shape as shown in the image below?
        /*System.out.println("Enter number for reverse pyramid");
        int num = Integer.parseInt(reader.nextLine());
        drawPyramid(num);*/

        // 9.Modify the previously created starts piramid in a way that now you are not printing the stars
        // but in each row numbers from 1 to the current row count.
        /*System.out.println("Enter number for pyramid");
        int num = Integer.parseInt(reader.nextLine());
        drawStarsPyramid(num);*/

        // 10.In this exercise, you need to create a guess number game.
        // The user enters  a number, which is in the range 0 to 100 (both 0 and 100 are possible).
        // Then the user has the chance to guess once, what the number is.
        // The program should print "The number is lower", "The number is greater" or "Congratulations,
        // your guess is correct!" depending on the number the user typed.
        // The guessing should be made repeatedly until the user types the right number.
        // The program also needs to include a variable of type int, which is used to count the guesses the user has made.
        // The program should always print the number of guesses along with the answer.
        // In the end your game should look like this:
        /*int number = 57;
        int count = 0;
        while (true) {
            System.out.println("Try to guess the number, enter a number between 0-100");
            int guess = Integer.parseInt(reader.nextLine());
            count++;
            if (guess == number) {
                System.out.println("Congratulations!" + "You guessed it " + count + " tries");
                break;
            }
            else if (guess > number) {
                System.out.println("Try guessing Lower" + ", You are on guess: " + count);
            }
            else{
                System.out.println("Try guessing Higher" + ", You are on guess: " + count);
            }*/



        }




    }

    // TASK9
    /*public static void drawStarsPyramid(int pyramid) {
        for (int i = 1; i <= pyramid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }*/

    // TASK8
    /*public static void drawPyramid(int pyramid) {
        for (int i = pyramid; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/

    // TASK7
    /*public static void drawStarsPyramid(int pyramid) {
        for (int i = 1; i <= pyramid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }*/

    // TASK 6
    /*public static void printText(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
        }
    }*/

