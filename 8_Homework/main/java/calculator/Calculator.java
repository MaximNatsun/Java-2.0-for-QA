package calculator;

import calculator.operations.Difference;
import calculator.operations.Divide;
import calculator.operations.Multiply;
import calculator.operations.Sum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        System.out.print("Введите первое число: ");
        try {
            a = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Необходимо вводить данные в числовом формате");
            System.exit(0);
        }
        System.out.print("Введите второе число: ");
        try {
            b = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Необходимо вводить данные в числовом формате");
            System.exit(0);
        }
        System.out.print("Введите оператор: ");
        String operator = "";
        try {
            operator = in.next();
        } catch (UnsupportedOperationException e) {
            System.exit(0);
        }

        double currentResult = 0;

        switch (operator) {
            case "*":
                Multiply mult1 = new Multiply(a,b);
                currentResult = mult1.getResult(a,b);
                System.out.println("Результат выполнения операции '" + mult1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
                break;
            case "/":
                Divide div1 = new Divide(a,b);
                try {
                    currentResult = div1.getResult(a,b);
                    if (currentResult == Double.POSITIVE_INFINITY || currentResult == Double.NEGATIVE_INFINITY) {
                        throw new ArithmeticException();
                    } else {
                        System.out.println("Результат выполнения операции '" + div1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: делить на ноль нельзя!");
                }
                break;
            case "+":
                Sum sum1 = new Sum(a,b);
                currentResult = sum1.getResult(a,b);
                System.out.println("Результат выполнения операции '" + sum1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
                break;
            case "-":
                Difference diff1 = new Difference(a,b);
                currentResult = diff1.getResult(a,b);
                System.out.println("Результат выполнения операции '" + diff1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
                break;
            default:
                System.out.print("Неизвестный оператор. Требуется ввести один из: * / + -");
        }
    }
}


