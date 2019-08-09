package StackTraceNCallStack;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("unable to perform division");
        }
    }

    private static int divide() {
        int x;
        int y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + " and y is " + y);
            return x / y;
//        } catch(NoSuchElementException e) {
//            throw new ArithmeticException("no suitable input");
//        } catch(ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by 0");
//        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go round again. Read past the end of line
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }

    }
}
