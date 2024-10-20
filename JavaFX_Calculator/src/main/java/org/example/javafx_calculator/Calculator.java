package org.example.javafx_calculator;

public class Calculator {
    double operand1;   // Stores the first operand
    double operand2;   // Stores the second operand
    char operator;     // Stores the arithmetic operator
    double result;     // Stores the result of the operation
    boolean isError;   // Tracks if an error occurred (e.g., division by zero)

    // first we set thus we call it setter methods
    public void setOperand1(double operand) { // Sets the first operand
        this.operand1 = operand;
    }

    public void setOperand2(double operand) { // Sets the second operand
        this.operand2 = operand;
    }

    public void setOperator(char operator) { // Sets the arithmetic operator
        this.operator = operator;
    }

    public void calculate() { // Performs the calculation based on the operator
        isError = false;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;
        }
    }

    // getting results aka getter methods
    public double getResult() { // Returns the result of the operation
        return result;
    }

    public boolean isError() { // Returns true if an error occurred (e.g., division by zero)
        return isError;
    }

    // Reset fields
    public void reset() { // Resets all fields (for a new calculation)
        isError = false;
        operand1 = 0;
        operand2 = 0;
        operator = ' ';
        result = 0;
    }
}
