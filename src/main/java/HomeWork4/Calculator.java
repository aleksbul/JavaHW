package HomeWork4;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Stack<Double> results = new Stack<>();
        System.out.print("\nEnter the number: ");
        double result = Double.parseDouble(scanner.nextLine());
        results.push(result);
        boolean f = true;

        while (f) {
            System.out.print("Enter the operator: ");
            String operator = scanner.nextLine();
            while (operator.equals("undo")) {
                results.pop();
                result = results.peek();
                System.out.println("Result: " + result);
                System.out.print("Enter the operator: ");
                operator = scanner.nextLine();
            }
            System.out.print("Enter the number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            switch (operator) {
                case "+":

                    result = plus(result, num2);
                    results.push(result);
                    System.out.printf("Result: " + result + "\n");
                    System.out.println("Write 'undo' if you would like to undo the last operation");
                    continue;

                case "-":
                    result = minus(result, num2);
                    results.push(result);
                    System.out.printf("Result: " + result + "\n");
                    System.out.println("Write 'undo' if you would like to undo the last operation");
                    continue;

                case "*":
                    result = mult(result, num2);
                    results.push(result);
                    System.out.printf("Result: " + result + "\n");
                    System.out.println("Write 'undo' if you would like to undo the last operation");
                    continue;

                case "/":
                    result = div(result, num2);
                    results.push(result);
                    System.out.printf("Result: " + result + "\n");
                    System.out.println("Write 'undo' if you would like to undo the last operation");
                    continue;

                default:
                    f = false;
                    break;
            }
        }

    }

    static double plus(double a, double b) {
        return a + b;
    }

    static double minus(double a, double b) {
        return a - b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

}


