package LGMVIP;

import java.util.ArrayList;


public class MathematicalFunctions {

    static int i;
    String input;
    float output;
    ArrayList<String> inputArray = new ArrayList<>();
    String[] array;
    static float firstNumber, secondNumber, answer;
    String operator;

   /* void math() {
        CalculatorGui calculator = new CalculatorGui();
        inputArray.clear();

        input = CalculatorGui.textField.getText();
        // Clear the inputArray before processing a new input

        StringBuilder expression = new StringBuilder();
        for (i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '+') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("+"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == '-') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("-"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == '*') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("*"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == '/') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("/"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == 's') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("sin"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == 'c') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("cos"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == 't') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("tan"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == 'l') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("log"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }
            else if (currentChar == '√') {
                inputArray.add(expression.toString()); // Add the current operand
                inputArray.add("√"); // Add the operator
                expression = new StringBuilder(); // Reset expression
            }


            else {
                expression.append(currentChar);
            }
        }

        // Add the last operand if there's no trailing '+'
        if (expression.length() > 0) {
            inputArray.add(expression.toString());
        }

        System.out.println(inputArray);
    }*/

    void math(){
        CalculatorGui calculator = new CalculatorGui();
        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        }
        else if(operator.equals("-")){
            answer = firstNumber - secondNumber;
        }
        else if(operator.equals("*")){
            answer = firstNumber * secondNumber;
        }
        else if(operator.equals("/")){
            answer = firstNumber / secondNumber;
        }
        else if(operator.equals("sin")){
            answer = (float) Math.sin(Math.toRadians(secondNumber));
        }
        else if(operator.equals("cos")){
            answer = (float) Math.cos(Math.toRadians(secondNumber));
        }
        else if(operator.equals("tan")){
            answer = (float) Math.tan(Math.toRadians(secondNumber));
        }
        else if(operator.equals("sin^-1")){
            answer = (float) Math.toDegrees(Math.asin(secondNumber));
        }
        else if(operator.equals("cos^-1")){
            answer = (float) Math.toDegrees(Math.acos(secondNumber));
        }
        else if(operator.equals("tan^-1")){
            answer = (float) Math.toDegrees(Math.atan(secondNumber));
        }

        else if(operator.equals("log")){
            answer = (float) Math.log10(secondNumber);
        }
        else if(operator.equals("√")){
            answer = (float) Math.sqrt(secondNumber);
        }
        else if(operator.equals("x^y")){
            answer = (float) Math.pow(firstNumber, secondNumber);
        }
        else if(operator.equals("x^2")){
            answer = (float) Math.pow(firstNumber, 2);
        }
        else if(operator.equals("x^3")){
            answer = (float) Math.pow(firstNumber, 3);
        }
        else if(operator.equals("x!")){
            float factorial =1;
                for(int i=1;i<=firstNumber;i++){
                factorial = factorial*i;
            }
            answer = factorial;
        }
        else if(operator.equals("%")){
            answer= firstNumber/=100;
        }

    }


}