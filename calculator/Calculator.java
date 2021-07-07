package calculator;

import calculator.operations.Difference;
import calculator.operations.Divide;
import calculator.operations.Multiply;
import calculator.operations.Sum;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();
        System.out.print("Введите оператор: ");
        String operator = in.next();

        double currentResult = 0;

        switch (operator) {
            case "*":
                Multiply mult1 = new Multiply(a,b);
                currentResult = mult1.getResult(a,b);
                System.out.println("Результат выполнения операции '" + mult1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
                break;
            case "/":
                Divide div1 = new Divide(a,b);
                currentResult = div1.getResult(a,b);
                System.out.println("Результат выполнения операции '" + div1.getOperator() + "' числа " + a + " и числа " + b + " = " + String.format("%.4f", currentResult));
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
