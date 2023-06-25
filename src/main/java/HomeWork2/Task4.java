package HomeWork2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Task4 {

    static File fileLog;
    static FileWriter fileWriter;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            fileLog = new File("calcLog.txt");
            fileWriter = new FileWriter(fileLog);

            char wish = 'y';
            while (wish == 'y') {


                System.out.print("\nEnter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the operator: ");
                char operator = scanner.nextLine().charAt(0);
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                switch (operator) {
                    case '+':
                        String strPlus = num1 + " " + operator + " " + num2 + " = " + plus(num1, num2);
                        fileWriter.write(strPlus + "\n");
                        System.out.printf(strPlus);
                        break;

                    case '-':
                        String strMinus = num1 + " " + operator + " " + num2 + " = " + minus(num1, num2);
                        fileWriter.write(strMinus + "\n");
                        System.out.printf(strMinus);
                        break;

                    case '*':
                        String strMult = num1 + " " + operator + " " + num2 + " = " + mult(num1, num2);
                        fileWriter.write(strMult + "\n");
                        System.out.printf(strMult);
                        break;

                    case '/':
                        String strDiv = num1 + " " + operator + " " + num2 + " = " + div(num1, num2);
                        fileWriter.write(strDiv + "\n");
                        System.out.printf(strDiv);
                        break;
                }
                System.out.println("'\n\nDo you want to try again? y/n ");
                wish = scanner.nextLine().charAt(0);
            }

            fileWriter.close();
        } catch (Exception e) {

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
