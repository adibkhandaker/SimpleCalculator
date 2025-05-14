package com.example.simplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML

    private Label calculatorText;
    private double result;
    private String valueOne = "";
    private String valueTwo = "";
    private String operator;
    private boolean value1Done = false;
    private boolean value2Done = false;
    private boolean clear = true;

    public void oneButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "1";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "1";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void twoButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "2";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "2";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void threeButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "3";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "3";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void fourButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "4";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "4";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void fiveButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "5";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "5";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void sixButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "6";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "6";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void sevenButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "7";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "7";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void eightButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "8";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "8";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void nineButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "9";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "9";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void zeroButton(ActionEvent e) {
        if (clear) {
            if (!value1Done) {
                valueOne = valueOne + "0";
                calculatorText.setText(valueOne);
            } else {
                valueTwo = valueTwo + "0";
                calculatorText.setText(valueTwo);
            }
        }
    }

    public void plusButton(ActionEvent e) {
        if (!value1Done && !valueOne.isEmpty()) {
            value1Done = true;
            operator = "+";
            calculatorText.setText(operator);
        } else if (!clear) {
            valueOne = this.result + "";
            valueTwo = "";
            value2Done = false;
            operator = "/";
            calculatorText.setText(operator);
            clear = true;
        }
    }

    public void minusButton(ActionEvent e) {
        if (!value1Done && !valueOne.isEmpty()) {
            value1Done = true;
            operator = "-";
            calculatorText.setText(operator);
        } else if (!clear) {
            valueOne = this.result + "";
            valueTwo = "";
            value2Done = false;
            operator = "-";
            calculatorText.setText(operator);
            clear = true;
        }
    }

    public void multiplyButton(ActionEvent e) {
        if (!value1Done && !valueOne.isEmpty()) {
            value1Done = true;
            operator = "*";
            calculatorText.setText(operator);
        } else if (!clear) {
            valueOne = this.result + "";
            valueTwo = "";
            operator = "*";
            calculatorText.setText(operator);
            value2Done = false;
            clear = true;
        }
    }

    public void divideButton(ActionEvent e) {
        if (!value1Done && !valueOne.isEmpty()) {
            value1Done = true;
            operator = "/";
            calculatorText.setText(operator);
        } else if (!clear) {
            valueOne = this.result + "";
            valueTwo = "";
            operator = "/";
            calculatorText.setText(operator);
            value2Done = false;
            clear = true;
        }
    }


    public void equalsButton(ActionEvent e) {
        if (clear) {
            double result = 0;
            clear = false;
            value2Done = true;
            double numOne = Double.parseDouble(valueOne);
            double numTwo = Double.parseDouble(valueTwo);
            if (operator.equals("+")) {
                result = numOne + numTwo;
            } else if (operator.equals("-")) {
                result = numOne - numTwo;
            } else if (operator.equals("*")) {
                result = numOne * numTwo;
            } else if (operator.equals("/")) {
                result = numOne / numTwo;
            }
            this.result = result;
            calculatorText.setText(this.result + "");
        }
    }

    public void clearButton(ActionEvent e) {
        valueOne = "";
        valueTwo = "";
        value1Done = false;
        value2Done = false;
        operator = "";
        clear = true;
        calculatorText.setText("");
    }


}
