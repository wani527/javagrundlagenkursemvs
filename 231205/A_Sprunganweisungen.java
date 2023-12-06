// package com.berufsfachschule.a_sprunganweisungen;
import java.lang.System;
import java.util.Scanner;

public class A_Sprunganweisungen {

    public static void main(String[] args) {
        //----------------------------------------------------------------------
        // 1. Check the program below and see, what it does.
        //    It does the job, but not really very elegantly. Imagine, we would
        //    like to calculate the sum of n-numbers (for example: 10).
        //    You would have to make more variables and write similar code again
        //    and that code to solve that simple problem would get (unecessary) big

        //    Comment the solution out (you can keep the Scanner :) ) and implement
        //    a while-loop, which does the same for 5 numbers.
        //    
        Scanner numberScanner = new Scanner(System.in);

        /*
        System.out.println("Input number 1: ");
        int number1 = numberScanner.nextInt();

        System.out.println("Input number 2: ");
        int number2 = numberScanner.nextInt();

        System.out.println("Input number 3: ");
        int number3 = numberScanner.nextInt();

        int sumOfNumbers1To3 = number1 + number2 + number3;

            System.out.println("The sum of all three numbers is: " + sumOfNumbers1To3);

        */

        int numbersRead = 0;
        int sum = 0;
        int totalNumbers = 5;
        totalNumbers--;

        thewhileloop1:
        while (true) {
            System.out.println("Input number " + numbersRead + ": ");
            sum = sum + numberScanner.nextInt();
            if (numbersRead >= totalNumbers) {
                break thewhileloop1;
            }
            numbersRead++;
        }

        System.out.println("The sum of all the numbers is: " + sum);

        // Sample output:
        // Input number 0:
        // 0
        // Input number 1:
        // 1
        // Input number 2:
        // 2
        // Input number 3:
        // 3
        // Input number 4:
        // 4
        // The sum of all the numbers is: 10
        //----------------------------------------------------------------------
        // 2. Write a program, where it asks you what currently is making your
        //    life hard or what you like to do. If the user writes "exit", the
        //    program should stop. (Let the user know, that "exit" will exit
        //    the program
        Scanner textScanner = new Scanner(System.in);
        String input2;
        thewhileloop2:  
        while (true) {
            System.out.print("You can exit this program anytime with \"exit\"\nWhat is making your life difficult now?\n");
            input2 = textScanner.nextLine();
            if (input2.equals("exit")) {
                break thewhileloop2;
            } else {
                System.out.println(input2 + ". Uff, thats a touch one!");
            }
        }
        
        // Sample output:
        // You can exit this program anytime with "exit"
        // What is making your life difficult now?
        // Money!
        // Money!. Uff, thats a though one!
        // You can exit this program anytime with "exit"
        // What is making your life difficult now?
        // Fame!
        // Fame!. Uff, thats a though one!
        // You can exit this program anytime with "exit"
        // What is making your life difficult now?
        // exit
        // You exited the program (Exercise 2)
        //----------------------------------------------------------------------
        // 3. Write a program that asks the user for numbers. 
        //    If the number is negative (smaller than zero), 
        //    the program prints for user "Unsuitable number" and asks the user 
        //    for a new number. If the number is zero, the program exits the loop.
        //    If the number is positive, the program prints 
        //    the number to the power of two.
        //
        // Sample output:
        // Type in a number: (0=exit)
        // 5
        // Your number: 5^2: 25
        // Type in a number: (0=exit)
        // -17
        // Unsuitable number
        // Type in a number: (0=exit)
        // 0
        // Exiting exercise 3
        //----------------------------------------------------------------------
        // 4. Write a program which asks the user for a number
        //    If the user writes 0, then the program exits
        //    Calculate the sums of both, positive and negative number
        //    Count how many times someone typed in a positive number
        //    Cound how many times someone typed in a negative number
        //
        //    Calculate the total sum, meaning the sum of the negative
        //    together with the sum of the positive numbers
        //    Tell the user if the total sum is either negative, positive
        //    or zero and print the total sum
        //
        //    Sample output:
        //    Type in a number (0=exit):
        //    5
        //    Type in a number (0=exit):
        //    -17
        //    Type in a number (0=exit):
        //    -3
        //    Type in a number (0=exit):
        //    7
        //    Type in a number (0=exit):
        //    50
        //    Type in a number (0=exit):
        //    0
        //    Calculating numbers first...
        //    The sum of the 3 positive numbers is: 62
        //    The sum of the 2 negative numbers is: -20
        //    The total sum is positive: 42
        //----------------------------------------------------------------------
        // 5. The following code below will run endlessly. Why?
        //    Can you fix it so, that it still has the same functionality,
        //    but will stop?
        /*
        
        int countingNumber = 0;
        
        while(countingNumber <= 10) {
            if(countingNumber == 5) {
                System.out.println("Skipping number 5...");
                continue;
            }
            System.out.println("Number: " + countingNumber);
            countingNumber++;
        }
        
         */
        
        //----------------------------------------------------------------------
        // 6. Print Odd Numbers: 
        // Write a program to print all odd numbers from 1 to 20 using a for loop.
        // Use the continue statement to skip even numbers.


        //----------------------------------------------------------------------
        // 7. Print Prime Numbers:
        // Write a program that prints all prime numbers from 100 to 200.
        // Use the continue statement to skip non-prime numbers.
        // Print the amount of prime numbers and the prime numbers.
        // Also print the amount of non prime numbers.
        /*
        System.out.print("Prime numbers from 100 to 200: ");
        int primesCounter = 0;
        int nonPrimesCounter = 0;
        
        // Your solution here
        
        System.out.println("\nTotal numbers: " + (primesCounter + nonPrimesCounter) + ".");
        System.out.println("Amount of non prime numbers: " + nonPrimesCounter);
        System.out.println("Amount of  prime numbers: " + primesCounter);

       
        //----------------------------------------------------------------------
        // 8. Find a Divisor:
        // Write a program to find the smallest divisor of a given number.
        // Use a loop and the break statement to exit the loop 
        // when the first divisor is found.
        // Start iteration with 2 (otherwise, every number would be divisible by 1)
        
        int number = 1337;
        int smallestDivisor = 1;
        
        // Your solution here
        
        System.out.println("The smallest divisor of " + number + " is: " + smallestDivisor);
   
        //----------------------------------------------------------------------
        // 9. Greatest Common Divisor (GCD)
        // Implement a program to find the largest common divisor (GCD) of two numbers.
        // Use a loop and the break statement to exit the loop when the GCD is found.
        // Hint: Start your loop from the smaller number down to 1.
        
        int number1Ex9 = 24;
        int number2Ex9 = 36;
        
        int gcd = 1; // GCD for the above numbers would be 12.
        
        // Your solution here
        
        // <eSystem.out.println("The Greatest Common Divisor (GCD) of " + number1 + " and " + number2 + " is: " + gcd);
        */
        
    }
}
