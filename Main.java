package http;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);



    //function to checkPalindrome

    public void checkPalindrome(String input)  {

        StringBuilder rev = new StringBuilder(); //declaring rev to store reversed characters
        int len = input.length();
        for (int i = len - 1; i>=0;i--){ //loop to store the chars to rev in reversed
            rev.append(input.charAt(i));

        }

        if (input.equals(rev.toString())){
            System.out.println("Entered Number " + input + " is a Palindrome"); // prints result if true
        }else{
            System.out.println("Entered Number " + input + " is not a Palindrome"); //prints result if false
        }

        System.out  .println();

    }



    //function to printPattern

    public void printPattern(int n) {

        for (int i = n-1; i>=0; i--){ // loop to iterate for series of given number
            for (int j=0; j<=i; j++){ // loop to print No.of stars for each given number
                System.out.print("*" + " ");
            }
            System.out.println(); // Prints new line for the next number
        }

    }



    //function to check no is prime or not

    public void checkPrimeNumber(int num) {

        int p, res = 0;
        p = num/2;
        if (num==0|num==1){ // prints if num is either 0 or 1 as not prime before going to loop
            System.out.println(num + " is not a Prime Number");
        }else{

            for (int i=2; i<=p; i++){ // loop to find if it is prime number
                if (num%i==0){
                    System.out.println(num + " is not a Prime Number");
                    res = 1;
                    break;
                }
            }
        }
        if (res==0){
            System.out.println(num + " is Prime Number");
        }
        System.out.println();


    }



    // function to print Fibonacci Series

    public void printFibonacciSeries(int cnt) {

        //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1, num;

            System.out.print(first + ", " + second); // print the first and second value

        for (int i=2;i<cnt;i++){ // generates and prints the rest of the values

            // finds the next number in the series
            num = first + second;
            System.out.print(", " + num);

            // Assigns next set of Numbers
            first = second;
            second = num;
        }
        System.out.println();

    }



//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();



            choice = sc.nextInt();

            switch (choice) {



                case 0:

                    choice = 0;

                    break;



                case 1: {
                System.out.println("Enter a number to check if it is a Palindrome : \n");
                int in;
                    in = sc.nextInt();
                    String inS = String.valueOf(in);
                    if (inS.equals("")) {
                        System.out.println("Invalid Input\n");
                        break;
                    }else {
                        obj.checkPalindrome(inS);
                        System.out.println();
                    }

                }

                break;



                case 2: {

                System.out.println("Enter a number to Print Pattern : \n");
                int num;
                    num = sc.nextInt();
                    if (num == 0) {
                        System.out.println("Invalid Input\n");
                        break;
                    }else {
                        obj.printPattern(num);
                        System.out.println();
                    }

                }

                break;



                case 3: {
                System.out.println("Enter a number to check if it is a Prime Number : \n");
                int n;
                    n = sc.nextInt();
                    obj.checkPrimeNumber(n);
                    System.out.println();

                }

                break;



                case 4: {

                    System.out.println("Enter a number to print the Fibonacci Series : \n");
                    int fn;
                    fn = sc.nextInt();
                    if (fn==0){
                        System.out.println("Invalid Input\n");
                        System.out.println();

                        break;
                    }else {
                        obj.printFibonacciSeries(fn);
                        System.out.println();
                    }

                }

                break;



                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }



        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }
}
