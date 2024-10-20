//package org.example.javafx_calculator;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.TextField;
//
//public class CalculatorController {
//
//    Calculator calc = new Calculator();
//
//    @FXML
//    private TextField text;
//
//    @FXML
//    private void onClickButton0() {
//        String val = text.getText();
//        val = val + "0";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton1() {
//        String val = text.getText();
//        val = val + "1";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton2() {
//        String val = text.getText();
//        val = val + "2";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton3() {
//        String val = text.getText();
//        val = val + "3";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton4() {
//        String val = text.getText();
//        val = val + "4";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton5() {
//        String val = text.getText();
//        val = val + "5";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton6() {
//        String val = text.getText();
//        val = val + "6";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton7() {
//        String val = text.getText();
//        val = val + "7";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton8() {
//        String val = text.getText();
//        val = val + "8";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButton9() {
//        String val = text.getText();
//        val = val + "9";
//        text.setText(val);
//    }
//
//    @FXML
//    private void onClickButtonPlus() {
//        String op1 = text.getText();
//        text.setText("");
//        calc.setOperand1(Double.parseDouble(op1));
//        calc.setOperator('+');
//    }
//    @FXML
//    private void onClickButtonMinus() {
//        String op1 = text.getText();
//        text.setText("");
//        calc.setOperand1(Double.parseDouble(op1));
//        calc.setOperator('-');
//    }
//
//    @FXML
//    private void onClickButtonMultiply() {
//        String op1 = text.getText();
//        text.setText("");
//        calc.setOperand1(Double.parseDouble(op1));
//        calc.setOperator('*');
//    }
//
//    @FXML
//    private void onClickButtonDivide() {
//        String op1 = text.getText();
//        text.setText("");
//        calc.setOperand1(Double.parseDouble(op1));
//        calc.setOperator('/');
//    }
//
//    @FXML
//    private void onClickButtonEqual() {
//        String op2 = text.getText();
//        calc.setOperand2(Double.parseDouble(op2));
//        calc.calculate();
//        text.setText(String.valueOf(calc.getResult()));
//    }
//
//    @FXML
//    private void onClickButtonClear() {
//        text.setText("");
//        calc.reset();
//    }
//
//    private void appendToText(String value) {
//        String currentText = text.getText();
//        text.setText(currentText + value);
//    }
//}


package org.example.javafx_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    Calculator calc = new Calculator();

    @FXML
    private TextField text;

    @FXML
    private void onClickNumberButton(String number) {
        text.setText(text.getText() + number);
    }

    @FXML
    private void onClickButton0() { onClickNumberButton("0"); }
    @FXML
    private void onClickButton1() { onClickNumberButton("1"); }
    @FXML
    private void onClickButton2() { onClickNumberButton("2"); }
    @FXML
    private void onClickButton3() { onClickNumberButton("3"); }
    @FXML
    private void onClickButton4() { onClickNumberButton("4"); }
    @FXML
    private void onClickButton5() { onClickNumberButton("5"); }
    @FXML
    private void onClickButton6() { onClickNumberButton("6"); }
    @FXML
    private void onClickButton7() { onClickNumberButton("7"); }
    @FXML
    private void onClickButton8() { onClickNumberButton("8"); }
    @FXML
    private void onClickButton9() { onClickNumberButton("9"); }

    @FXML
    private void onClickOperatorButton(char operator) {
        String op1 = text.getText();
        text.setText("");
        calc.setOperand1(Double.parseDouble(op1));
        calc.setOperator(operator);
    }

    @FXML
    private void onClickButtonPlus() { onClickOperatorButton('+'); }
    @FXML
    private void onClickButtonMinus() { onClickOperatorButton('-'); }
    @FXML
    private void onClickButtonMultiply() { onClickOperatorButton('*'); }
    @FXML
    private void onClickButtonDivide() { onClickOperatorButton('/'); }

    @FXML
    private void onClickButtonEqual() {
        String op2 = text.getText();
        calc.setOperand2(Double.parseDouble(op2));
        calc.calculate();

        if (calc.isError()) {
            text.setText("Error: Division by Zero");
        } else {
            text.setText(String.valueOf(calc.getResult()));
        }
    }

    @FXML
    private void onClickButtonClear() {
        text.setText("");
        calc.reset();
    }
}
