import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

            //Q1
            //for (int i = 1; i<=100; i = i+1) {
            //if (i % 3 == 0 && i % 5 == 0) {
            //System.out.println("FizzBuzz");
            //} else if (i % 3 == 0) {
            //System.out.println("Fizz");
            //} else if (i % 5 == 0) {
            //System.out.println("Buzz");
            //} else {
            //System.out.println(i);
            //}
            //Q2
            Scanner input = new Scanner(System.in);
            //System.out.println("enter a string:");
            //String s = input.next();

            //String reversed = reverseString(s);

            //Q3
            //System.out.print("please enter the number: ");
            //int num = input.nextInt();
            //input.close();
            //long factorial = 1;
            //for (int i = 1; i <= num; i=i+1) {
            //factorial *= i;
            //}
            //System.out.println(num+ "Factorial of is: " + factorial);

            //Q4
            //System.out.print("base number:");
            //int s = input.nextInt();
            //System.out.print("exponent number:");
            //int e = input.nextInt();

            //int total = calculatePower(s, e);
            //System.out.println(s + " result to the power of " + e + " is: " + total);
            //}private static int calculatePower(int s, int e) {
            //int total = 1;

            //while (e != 0) {
            //total *= s;
            //--e; }
            //return total;

            //Q5
            //int even = 0;
            //int odd = 0;
            //System.out.print("Enter a number:");
            //int num = input.nextInt();

            //while (num != 500) {
            //if (num % 2 == 0) {
            //even += num;
            //} else {
            //odd += num;
            //}

            //System.out.print("Enter a number:");
            //num = input.nextInt();
            // }
            //System.out.println("Sum of even numbers: " + even);
            //System.out.println("Sum of odd numbers: " + odd);

            //Q6
            //System.out.print("Enter a positive number:");
            //int num = input.nextInt();
            //boolean isPrime = true;

            //if (num <= 1) {
            //isPrime = false;
            //} else {
            //for (int i = 2; i <= num /2; i=i+1) {
            //if (num % i == 0) {
            //isPrime = false;
            //break;
            //}
            //}
            //}

            //if (isPrime) {
            //System.out.println(num + " is a prime number.");
            //} else {
            //System.out.println(num + " is not a prime number.");
            //}

            //Q7
            //for (int week = 1; week <= 4; week++) {
            //System.out.println("Week" + week + ":");

            //for (int day = 1; day <= 7; day++) {
            //System.out.println("Day" + day);
            //}
            //System.out.println();

            //Q8
            String str, rev = "";
            System.out.println("Enter a word:");
            String word = input.nextLine();

            int length = word.length();
            for ( int i = length - 1; i >= 0; i=i-1 )
                rev = rev + word.charAt(i);
            if (word.equals(rev))
                System.out.println(word+" is a palindrome");
            else
                System.out.println(word+" is not a palindrome");

        }
    }


