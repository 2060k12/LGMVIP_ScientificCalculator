package LGMVIP;

public class MathematicalFunctions {

    static float firstNumber, secondNumber, answer;
    String operator;


    void math() {
        // This is a switch statement, which is a way to execute different code based on different conditions.
        switch (operator) {

            case "+": // If the operator is "+", then add the firstNumber and secondNumber and store the result in answer.
                answer = firstNumber + secondNumber;
                break;
            case "-": // If the operator is "-", then subtract the firstNumber and secondNumber and store the result in answer.
                answer = firstNumber - secondNumber;
                break;
            case "*": // If the operator is "*", then multiply the firstNumber and secondNumber and store the result in answer.
                answer = firstNumber * secondNumber;
                break;
            case "/": // If the operator is "/", then divide the firstNumber and secondNumber and store the result in answer.
                answer = firstNumber / secondNumber;
                break;
            case "sin": // If the operator is "sin", then find the sine of the secondNumber and store the result in answer.
                answer = (float) Math.sin(Math.toRadians(secondNumber));
                break;
            case "cos": // If the operator is "cos", then find the cosine of the secondNumber and store the result in answer.
                answer = (float) Math.cos(Math.toRadians(secondNumber));
                break;
            case "tan": // If the operator is "tan", then find the tangent of the secondNumber and store the result in answer.
                answer = (float) Math.tan(Math.toRadians(secondNumber));
                break;
            case "sin^-1": // If the operator is "sin^-1", then find the inverse sine of the secondNumber and store the result in answer.
                answer = (float) Math.toDegrees(Math.asin(secondNumber));
                break;
            case "cos^-1": // If the operator is "cos^-1", then find the inverse cosine of the secondNumber and store the result in answer.
                answer = (float) Math.toDegrees(Math.acos(secondNumber));
                break;
            case "tan^-1": // If the operator is "tan^-1", then find the inverse tangent of the secondNumber and store the result in answer.
                answer = (float) Math.toDegrees(Math.atan(secondNumber));
                break;
            case "log": // If the operator is "log", then find the log of the secondNumber and store the result in answer.
                answer = (float) Math.log10(secondNumber);
                break;
            case "√": // If the operator is "√", then find the square root of the secondNumber and store the result in answer.
                answer = (float) Math.sqrt(secondNumber);
                break;
            case "x^y": // If the operator is "x^y", then find the firstNumber to the power of the secondNumber and store the result in answer.
                answer = (float) Math.pow(firstNumber, secondNumber);
                break;
            case "x^2": // If the operator is "x^2", then find the firstNumber to the power of 2 and store the result in answer.
                answer = (float) Math.pow(firstNumber, 2);
                break;
            case "x^3": // If the operator is "x^3", then find the firstNumber to the power of 3 and store the result in answer.
                answer = (float) Math.pow(firstNumber, 3);
                break;
            case "x!": // If the operator is "x!", then find the factorial of the firstNumber and store the result in answer.
                float factorial = 1;
                for (int i = 1; i <= firstNumber; i++) {
                    factorial = factorial * i;
                }
                answer = factorial;
                break;
            case "%": // If the operator is "%", then find the firstNumber divided by 100 and store the result in answer.
                answer = firstNumber /= 100;
                break;
        }

    }


}