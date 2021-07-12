package calculator.operations;

import calculator.Operation;

public class Sum extends Operation {
    private String operator = "сложение";

    public Sum(double num1, double num2) {
        super(num1, num2);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult(double num1, double num2) {
        return num1 + num2;
    }
}
