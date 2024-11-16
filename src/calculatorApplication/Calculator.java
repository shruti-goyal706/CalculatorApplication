package calculatorApplication;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    double num1 = 0, num2=0,result;
    int calculation;

    JFrame frame=new JFrame("Calculator");
    ImageIcon imageIcon=new ImageIcon("C:/Users/goyal_9mqizxf/Downloads/171352_calculator_icon.png");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton button0=new JButton("0");
    JButton button1=new JButton("1");
    JButton button2=new JButton("2");
    JButton button3=new JButton("3");
    JButton button4=new JButton("4");
    JButton button5=new JButton("5");
    JButton button6=new JButton("6");
    JButton button7=new JButton("7");
    JButton button8=new JButton("8");
    JButton button9=new JButton("9");
    JButton buttonAdd=new JButton("+");
    JButton buttonSub=new JButton("-");
    JButton buttonMul=new JButton("X");
    JButton buttonDiv=new JButton("/");
    JButton buttonClr=new JButton("Clear");
    JButton buttonDel=new JButton("Delete");
    JButton buttonSqr=new JButton("sqr");
    JButton buttonDot=new JButton(".");
    JButton buttonEqual=new JButton("=");

    Calculator(){
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI(){
        frame.setBounds(30,30,400,440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(false);
        frame.setIconImage(imageIcon.getImage());
        frame.setLayout(null);
        frame.setVisible(true);

        label.setVisible(true);
    }
    public void addComponents(){
        label.setBounds(0,0,50,50);
        label.setForeground(Color.CYAN);
        frame.add(label);



        textField.setBounds(11,20,365,40);
        textField.setFont(new Font("Arial", Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(11,60,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,16));
        onRadioButton.setBackground(Color.BLACK);
        onRadioButton.setForeground(Color.WHITE);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(11,90,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,16));
        offRadioButton.setBackground(Color.BLACK);
        offRadioButton.setForeground(Color.WHITE);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonClr.setBounds(80,80,140,40);
        buttonClr.setFont(new Font("Arial",Font.ITALIC,16));
        buttonClr.setBackground(Color.RED);
        buttonClr.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonClr);

        buttonDel.setBounds(230,80,140,40);
        buttonDel.setFont(new Font("Arial",Font.ITALIC,16));
        buttonDel.setBackground(Color.RED);
        buttonDel.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonDel);

        button7.setBounds(10,140,80,40);
        button7.setFont(new Font("Arial",Font.BOLD,20));
        button7.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button7);

        button8.setBounds(100,140,80,40);
        button8.setFont(new Font("Arial",Font.BOLD,20));
        button8.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button8);

        button9.setBounds(190,140,80,40);
        button9.setFont(new Font("Arial",Font.BOLD,20));
        button9.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button9);


        buttonSqr.setBounds(280,140,90,40);
        buttonSqr.setFont(new Font("Arial",Font.BOLD,20));
        buttonSqr.setBackground(Color.YELLOW);
        buttonSqr.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonSqr);

        button4.setBounds(10,190,80,40);
        button4.setFont(new Font("Arial",Font.BOLD,20));
        button4.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button4);

        button5.setBounds(100,190,80,40);
        button5.setFont(new Font("Arial",Font.BOLD,20));
        button5.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button5);

        button6.setBounds(190,190,80,40);
        button6.setFont(new Font("Arial",Font.BOLD,20));
        button6.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button6);

        buttonDiv.setBounds(280,190,90,40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
        buttonDiv.setBackground(Color.YELLOW);
        buttonDiv.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonDiv);

        button1.setBounds(10,240,80,40);
        button1.setFont(new Font("Arial",Font.BOLD,20));
        button1.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button1);

        button2.setBounds(100,240,80,40);
        button2.setFont(new Font("Arial",Font.BOLD,20));
        button2.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button2);

        button3.setBounds(190,240,80,40);
        button3.setFont(new Font("Arial",Font.BOLD,20));
        button3.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button3);

        buttonMul.setBounds(280,240,90,40);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(Color.YELLOW);
        buttonMul.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonMul);

        button0.setBounds(10,290,170,40);
        button0.setFont(new Font("Arial",Font.BOLD,20));
        button0.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(button0);

        buttonDot.setBounds(190,290,80,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setBorder(BorderFactory.createEtchedBorder(Color.WHITE,Color.WHITE));
        frame.add(buttonDot);


        buttonAdd.setBounds(280,290,90,40);
        buttonAdd.setFont(new Font("Arial",Font.BOLD,20));
        buttonAdd.setBackground(Color.YELLOW);
        buttonAdd.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonAdd);


        buttonEqual.setBounds(10,340,260,40);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(Color.YELLOW);
        buttonEqual.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonEqual);


        buttonSub.setBounds(280,340,90,40);
        buttonSub.setFont(new Font("Arial",Font.BOLD,20));
        buttonSub.setBackground(Color.YELLOW);
        buttonSub.setBorder(new LineBorder(Color.WHITE));
        frame.add(buttonSub);
    }

    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClr.addActionListener(this);
        buttonDel.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonSqr.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        buttonDiv.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        buttonMul.addActionListener(this);
        button0.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonSub.addActionListener(this);

    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==onRadioButton){
            enable();
        }else if (obj==offRadioButton){
            disable();
        } else if (obj==buttonClr) {
            label.setText("");
            textField.setText("");
        } else if (obj==buttonDel) {
            int lenght = textField.getText().length();
            int number = lenght-1;
            if (lenght>0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }if (textField.getText().endsWith(""));
            label.setText("");
        } else if (obj==button0) {
            textField.setText(textField.getText()+"0");
        } else if (obj==button1) {
            textField.setText(textField.getText()+"1");
        } else if (obj==button2) {
            textField.setText(textField.getText()+"2");
        } else if (obj==button3) {
            textField.setText(textField.getText()+"3");
        } else if (obj==button4) {
            textField.setText(textField.getText()+"4");
        } else if (obj==button5) {
            textField.setText(textField.getText()+"5");
        } else if (obj==button6) {
            textField.setText(textField.getText()+"6");
        } else if (obj==button7) {
            textField.setText(textField.getText()+"7");
        } else if (obj==button8) {
            textField.setText(textField.getText()+"8");
        } else if (obj==button9) {
            textField.setText(textField.getText()+"9");
        } else if (obj==buttonDot) {
            textField.setText(textField.getText()+".");
        }else if (obj==buttonAdd){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
        }else if (obj==buttonSub) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
        }else if (obj==buttonMul) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
        }else if (obj==buttonDiv) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
        } else if (obj==buttonSqr) {
            num1=Double.parseDouble(textField.getText());
            double square = Math.pow(num1,2);
            String string =Double.toString(square);
            textField.setText(string);
        } else if (obj==buttonEqual) {
            num2=Double.parseDouble(textField.getText());
            switch (calculation){
                case 1: result = num1+num2;
                    break;
                case 2: result=num1-num2;
                    break;
                case 3: result=num1*num2;
                    break;
                case 4: result=num1/num2;
                    break;
            }if (Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }else {
                textField.setText(Double.toString(result));
            }
        }
    }
    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonSqr.setEnabled(true);
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSub.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonDel.setEnabled(true);
        buttonClr.setEnabled(true);
    }
    public void disable(){
        offRadioButton.setEnabled(false);
        onRadioButton.setEnabled(true);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonSqr.setEnabled(false);
        button0.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSub.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonDel.setEnabled(false);
        buttonClr.setEnabled(false);
    }
}

