package LGMVIP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGui implements ActionListener {
    static JTextField textField, activitiesText;
    MathematicalFunctions mathmaticalFunctions = new MathematicalFunctions();
    JRadioButton onRadioButton, offRadioButton;
    JButton[] buttons, functionButtons;
    JButton buttonDivide, buttonMultiply, buttonSub, buttonAdd, buttonEquals, buttonDot, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonRand, buttonAns, buttonDel, buttonAc;
    JButton buttonSin, buttonCos, buttonTan, buttonLog, buttonSqrt, buttonSqr, buttonPer, buttonFact, buttonPi, buttonInv, buttonOpnBrk, buttonCloBrk;
    boolean provideAns = false;
    float firstNumber, secondNumber, answer;

    void crateGui() {
        // creating a frame for our calculator
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setResizable(false); // setting it with a fixed size
        frame.setLocation(500, 200); // setting the location for our frame in the display
        frame.setLayout(null);

        // creating a text field for our display
        textField = new JTextField();
        textField.setBounds(10, 10, 380, 100); // setting the size and position for our calculator
        textField.setFont(new Font("Serif", Font.BOLD, 40));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBackground(new Color(0xCDEEEE));
        textField.setEditable(false); // setting the text field non-editable
        frame.add(textField); // adding the text field in the frame

        // creating a panel for our activities buttons
        JPanel activitiesButton = new JPanel();
        activitiesButton.setLayout(new FlowLayout(FlowLayout.RIGHT));

        activitiesButton.setBounds(10, 120, 380, 40);
        frame.add(activitiesButton);

        // creating panel for our functions buttons
        JPanel functionsButton = new JPanel();
        functionsButton.setLayout(new GridLayout(3, 4, 2, 2));
        functionsButton.setBounds(10, 180, 380, 200);

        //making a textfield in our activities panel
        activitiesText = new JTextField(5);
        activitiesText.setFont(new Font("Serif", Font.BOLD, 20));
        activitiesText.setEditable(false);
        activitiesText.setHorizontalAlignment(JTextField.CENTER);


        frame.add(functionsButton);

        // crating a  panel for our number button and operator buttons
        JPanel numOperatorButton = new JPanel();
        numOperatorButton.setLayout(new GridLayout(4, 5, 2, 2));
        numOperatorButton.setBounds(10, 390, 380, 270);
        frame.add(numOperatorButton);

        //creating buttons for our activities panel
        onRadioButton = new JRadioButton("ON");
        offRadioButton = new JRadioButton("OFF");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);


        //creating buttons for our function panel
        buttonSin = new JButton("sin");
        buttonCos = new JButton("cos");
        buttonTan = new JButton("tan");
        buttonLog = new JButton("log");
        buttonSqrt = new JButton("√");
        buttonSqr = new JButton("x^2");
        buttonPer = new JButton("%");
        buttonFact = new JButton("x!");
        buttonPi = new JButton("π");
        buttonInv = new JButton("Inv");
        buttonOpnBrk = new JButton("X^Y");
        buttonCloBrk = new JButton("X^3");

        // putting these buttons in an array
        functionButtons = new JButton[]{buttonSin, buttonCos, buttonTan, buttonLog, buttonSqrt, buttonSqr, buttonFact,
                buttonPi, buttonInv, buttonOpnBrk, buttonCloBrk, buttonPer};


        // creating number and operators buttons
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonDot = new JButton(".");
        buttonRand = new JButton("rand");
        buttonAns = new JButton("Ans");
        buttonDel = new JButton("DEL");
        buttonMultiply = new JButton("X");
        buttonDivide = new JButton("÷");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonEquals = new JButton("=");
        buttonAc = new JButton("AC");

        // putting these buttons in an array
        buttons = new JButton[]{button7, button8, button9, buttonDel, buttonAc, button4, button5, button6, buttonMultiply, buttonDivide,
                button1, button2, button3, buttonAdd, buttonSub, button0, buttonDot, buttonRand, buttonAns, buttonEquals};

        // adding these num and operator buttons in the panel and setting action listener in it
        for (JButton button : buttons) {
            numOperatorButton.add(button);
            button.addActionListener(this);
            button.setFocusable(false);
        }

        // adding these function buttons in the panel and setting action listener in it
        for (JButton functionButton : functionButtons) {
            functionsButton.add(functionButton);
            functionButton.addActionListener(this);
            functionButton.setFont(new Font("Serif", Font.BOLD, 20));
            functionButton.setFocusable(false);
        }

        // adding buttons in the activities panel
        activitiesButton.add(onRadioButton);
        activitiesButton.add(offRadioButton);
        activitiesButton.add(activitiesText);

        // adding action listener in the radio buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        offRadioButton.setSelected(true);

        for (JButton button : buttons) {
            button.setEnabled(false);
        }
        for (JButton functionButton : functionButtons) {
            functionButton.setEnabled(false);
        }

        frame.setVisible(true); // setting the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName = e.getActionCommand();
        if (buttonName.equals("ON")) {
            for (JButton button : buttons) {
                button.setEnabled(true);
            }
            for (JButton functionButton : functionButtons) {
                functionButton.setEnabled(true);
            }
        } else if (buttonName.equals("OFF")) {
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
            for (JButton functionButton : functionButtons) {
                functionButton.setEnabled(false);
            }

        }
        switch (buttonName) {
            case "1":
                textField.setText(textField.getText() + "1");
                break;

            /*add class for other buttons*/
            case "2":
                textField.setText(textField.getText() + "2");
                break;
            case "3":
                textField.setText(textField.getText() + "3");
                break;
            case "4":
                textField.setText(textField.getText() + "4");
                break;
            case "5":
                textField.setText(textField.getText() + "5");
                break;
            case "6":
                textField.setText(textField.getText() + "6");
                break;
            case "7":
                textField.setText(textField.getText() + "7");
                break;
            case "8":
                textField.setText(textField.getText() + "8");
                break;
            case "9":
                textField.setText(textField.getText() + "9");
                break;
            case "0":
                textField.setText(textField.getText() + "0");
                break;
            case ".":
                textField.setText(textField.getText() + ".");
                break;
            case "X":
                mathmaticalFunctions.operator = "*";
                MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                textField.setText("");
                break;

            case "÷":
                mathmaticalFunctions.operator = "/";
                MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                textField.setText("");
                break;
            case "+":
                mathmaticalFunctions.operator = "+";
                MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                textField.setText("");
                break;
            case "-":
                mathmaticalFunctions.operator = "-";
                MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                textField.setText("");
                break;
            case "=":
                MathematicalFunctions.secondNumber = Float.parseFloat(textField.getText());
                mathmaticalFunctions.math();
                textField.setText(String.valueOf(MathematicalFunctions.answer));
                activitiesText.setText("");
                break;
            case "sin":
                mathmaticalFunctions.operator = "sin";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Sin");

                break;
            case "cos":
                mathmaticalFunctions.operator = "cos";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Cos");
                break;
            case "tan":
                mathmaticalFunctions.operator = "tan";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Tan");
                break;
            case "log":
                mathmaticalFunctions.operator = "log";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Log");
                break;
            case "√":
                mathmaticalFunctions.operator = "√";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("√");
                break;
            case "x^2":
                try {
                    mathmaticalFunctions.operator = "x^2";
                    MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                    mathmaticalFunctions.math();
                    textField.setText(String.valueOf(MathematicalFunctions.answer));
                } catch (Exception exception) {
                    textField.setText("Error");
                }
                break;
            case "x!":
                try {
                    mathmaticalFunctions.operator = "x!";
                    MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                    mathmaticalFunctions.math();
                    textField.setText(String.valueOf(MathematicalFunctions.answer));
                } catch (Exception exception) {
                    textField.setText("Error");
                }
                break;
            case "π":
                textField.setText(String.valueOf((float) Math.PI));
                break;
            case "Inv":

                if (buttonSin.getText().equals("sin^-1")) {
                    buttonSin.setText("sin");
                } else if (buttonSin.getText().equals("sin")) {
                    buttonSin.setText("sin^-1");
                }
                if (buttonCos.getText().equals("cos^-1")) {
                    buttonCos.setText("cos");
                } else if (buttonCos.getText().equals("cos")) {
                    buttonCos.setText("cos^-1");
                }
                if (buttonTan.getText().equals("tan^-1")) {
                    buttonTan.setText("tan");
                } else if (buttonTan.getText().equals("tan")) {
                    buttonTan.setText("tan^-1");
                }
                break;

            // when inverse button is pressed sin cos and tan button changes to inverse
            case "sin^-1":
                mathmaticalFunctions.operator = "sin^-1";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Sin^-1");
                break;

            case "cos^-1":
                mathmaticalFunctions.operator = "cos^-1";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Cos^-1");
                break;

            case "tan^-1":
                mathmaticalFunctions.operator = "tan^-1";
                mathmaticalFunctions.math();
                textField.setText("");
                activitiesText.setText("Tan^-1");
                break;


            case "X^Y":
                try {
                    mathmaticalFunctions.operator = "x^y";
                    MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                    textField.setText("");
                } catch (Exception exception) {
                    textField.setText("Error");
                }
                break;
            case "X^3":
                try {
                    mathmaticalFunctions.operator = "x^3";
                    MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                    mathmaticalFunctions.math();
                    textField.setText(String.valueOf(MathematicalFunctions.answer));
                } catch (Exception exception) {
                    textField.setText("Error");
                }
                break;

            case "%":
                try {
                    mathmaticalFunctions.operator = "%";
                    MathematicalFunctions.firstNumber = Float.parseFloat(textField.getText());
                    mathmaticalFunctions.math();
                    textField.setText(String.valueOf(MathematicalFunctions.answer));
                } catch (Exception exception) {
                    textField.setText("Error");
                }
                break;
            case "rand":
                textField.setText(String.valueOf((float) Math.random()));
                break;
            case "Ans":
                textField.setText(String.valueOf(MathematicalFunctions.answer));
                break;
            case "DEL":
                String string = textField.getText();
                textField.setText("");
                for (int i = 0; i < string.length() - 1; i++) {
                    textField.setText(textField.getText() + string.charAt(i));
                }
                break;
            case "AC":
                textField.setText("");
                MathematicalFunctions.firstNumber = 0;
                MathematicalFunctions.secondNumber = 0;
                activitiesText.setText("");
                break;
        }


    }
}
