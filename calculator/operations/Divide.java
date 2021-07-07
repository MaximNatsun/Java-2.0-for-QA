package calculator.operations;

import calculator.Operation;

public class Divide extends Operation {
    private String operator = "деление";

    public Divide(double num1, double num2) {
        super(num1, num2);
    }

    public String getOperator() {
        return operator;
    }

    public double getResult(double num1, double num2) {
        return num1 / num2;
    }
}
