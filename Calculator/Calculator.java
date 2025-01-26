import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
    JPanel upperPanel;
    JPanel lowerPanel;
    JButton Digit1;
    JButton Digit2;
    JButton Digit3;
    JButton Digit4;
    JButton Digit5;
    JButton Digit6;
    JButton Digit7;
    JButton Digit8;
    JButton Digit9;
    JButton Digit0;
    JButton multiply;
    JButton add;
    JButton minus;
    JButton divide;
    JButton Decimal;
    JButton equal;
    JTextField screen;
    Double num1 ,num2 , FinalResult = 0.0;
    Integer count=0; 
    String KeepTrack = "";
    
    Calculator()
    {
        this.setTitle("Calculator");
        Digit0 = new JButton("0");
        Digit1 = new JButton("1");
        Digit2 = new JButton("2");
        Digit3 = new JButton("3");
        Digit4 = new JButton("4");
        Digit5 = new JButton("5");
        Digit6 = new JButton("6");
        Digit7 = new JButton("7");
        Digit8 = new JButton("8");
        Digit9 = new JButton("9");
        multiply = new JButton("x");
        add = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        Decimal = new JButton(".");
        equal = new JButton("=");
        screen = new JTextField();

        this.setLayout(new GridLayout(2,1));
        lowerPanel = new JPanel(new GridLayout(4,4));
        upperPanel = new JPanel();

        lowerPanel.add(Digit7);
        lowerPanel.add(Digit8);
        lowerPanel.add(Digit9);
        lowerPanel.add(divide);
        lowerPanel.add(Digit4);
        lowerPanel.add(Digit5);
        lowerPanel.add(Digit6);
        lowerPanel.add(multiply);
        lowerPanel.add(Digit1);
        lowerPanel.add(Digit2);
        lowerPanel.add(Digit3);
        lowerPanel.add(minus);
        lowerPanel.add(Digit0);
        lowerPanel.add(Decimal);
        lowerPanel.add(add);
        lowerPanel.add(equal);

        screen.setPreferredSize(new Dimension(590,200));
        screen.setFont(new Font("Arial",Font.PLAIN,120));
        upperPanel.add(screen);
        this.add(upperPanel);
        this.add(lowerPanel);

        Digit0.setFont(new Font("Arial",Font.PLAIN,40));
        Digit1.setFont(new Font("Arial",Font.PLAIN,40));
        Digit2.setFont(new Font("Arial",Font.PLAIN,40));
        Digit3.setFont(new Font("Arial",Font.PLAIN,40));
        Digit4.setFont(new Font("Arial",Font.PLAIN,40));
        Digit5.setFont(new Font("Arial",Font.PLAIN,40));
        Digit6.setFont(new Font("Arial",Font.PLAIN,40));
        Digit7.setFont(new Font("Arial",Font.PLAIN,40));
        Digit8.setFont(new Font("Arial",Font.PLAIN,40));
        Digit9.setFont(new Font("Arial",Font.PLAIN,40));
        add.setFont(new Font("Arial",Font.PLAIN,40));
        minus.setFont(new Font("Arial",Font.PLAIN,40));
        multiply.setFont(new Font("Arial",Font.PLAIN,40));
        divide.setFont(new Font("Arial",Font.PLAIN,40));
        Decimal.setFont(new Font("Arial",Font.PLAIN,40));
        equal.setFont(new Font("Arial",Font.PLAIN,40));

        Digit0.addActionListener(this);
        Digit1.addActionListener(this);
        Digit2.addActionListener(this);
        Digit3.addActionListener(this);
        Digit4.addActionListener(this);
        Digit5.addActionListener(this);
        Digit6.addActionListener(this);
        Digit7.addActionListener(this);
        Digit8.addActionListener(this);
        Digit9.addActionListener(this);
        add.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        Decimal.addActionListener(this);
        equal.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String currentText = screen.getText();
        if (e.getSource() == Digit0) {
            screen.setText(currentText + "0");
        } else if (e.getSource() == Digit1) {
            screen.setText(currentText + "1");
        } else if (e.getSource() == Digit2) {
            screen.setText(currentText + "2");
        } else if (e.getSource() == Digit3) {
            screen.setText(currentText + "3");
        } else if (e.getSource() == Digit4) {
            screen.setText(currentText + "4");
        } else if (e.getSource() == Digit5) {
            screen.setText(currentText + "5");
        } else if (e.getSource() == Digit6) {
            screen.setText(currentText + "6");
        } else if (e.getSource() == Digit7) {
            screen.setText(currentText + "7");
        } else if (e.getSource() == Digit8) {
            screen.setText(currentText + "8");
        } else if (e.getSource() == Digit9) {
            screen.setText(currentText + "9");
        } else if (e.getSource() == Decimal){
            screen.setText(currentText + ".");
        } else {
            count++;
        }
        if(e.getSource() == add)
        {
            num1 =  Double.parseDouble(currentText);
            if(KeepTrack.equals("+"))
            {
                FinalResult += num1;
            }
            else if(KeepTrack.equals("-"))
            {
                FinalResult -= num1;
            }
            else if(KeepTrack.equals("x"))
            {
                FinalResult *= num1;
            }
            else if(KeepTrack.equals("/"))
            {
                FinalResult /= num1;
            }
            else if(KeepTrack.equals("%"))
            {
                FinalResult %= num1;
            }
            if(count==1)
            {
                FinalResult = num1;
            }
            screen.setText("");
            KeepTrack = "+";
        }
        if(e.getSource() == minus)
        {
            num1 =  Double.parseDouble(currentText);
            if(KeepTrack.equals("+"))
            {
                FinalResult += num1;
            }
            else if(KeepTrack.equals("-"))
            {
                FinalResult -= num1;
            }
            else if(KeepTrack.equals("x"))
            {
                FinalResult *= num1;
            }
            else if(KeepTrack.equals("/"))
            {
                FinalResult /= num1;
            }
            else if(KeepTrack.equals("%"))
            {
                FinalResult %= num1;
            }
            if(count==1)
            {
                FinalResult = num1;
            }
            screen.setText("");
            KeepTrack = "-";
        }
        if(e.getSource() == multiply)
        {
            num1 =  Double.parseDouble(currentText);
            if(KeepTrack.equals("+"))
            {
                FinalResult += num1;
            }
            else if(KeepTrack.equals("-"))
            {
                FinalResult -= num1;
            }
            else if(KeepTrack.equals("x"))
            {
                FinalResult *= num1;
            }
            else if(KeepTrack.equals("/"))
            {
                FinalResult /= num1;
            }
            else if(KeepTrack.equals("%"))
            {
                FinalResult %= num1;
            }
            if(count==1)
            {
                FinalResult = num1;
            }
            screen.setText("");
            KeepTrack = "x";
        }
        if(e.getSource() == divide)
        {
            num1 =  Double.parseDouble(currentText);
            if(KeepTrack.equals("+"))
            {
                FinalResult += num1;
            }
            else if(KeepTrack.equals("-"))
            {
                FinalResult -= num1;
            }
            else if(KeepTrack.equals("x"))
            {
                FinalResult *= num1;
            }
            else if(KeepTrack.equals("/"))
            {
                FinalResult /= num1;
            }
            else if(KeepTrack.equals("%"))
            {
                FinalResult %= num1;
            }
            if(count==1)
            {
                FinalResult = num1;
            }
            screen.setText("");
            KeepTrack = "/";
        }
        if(e.getSource() == equal)
        {
            if(KeepTrack.equals("+"))
            {
                num2 =  Double.parseDouble(currentText);
                FinalResult += num2;
                screen.setText(String.format("%.2f", FinalResult));
            }
            if(KeepTrack.equals("-"))
            {
                num2 =  Double.parseDouble(currentText);
                FinalResult -= num2;
                screen.setText(String.format("%.2f", FinalResult));
            }
            if(KeepTrack.equals("x"))
            {
                num2 =  Double.parseDouble(currentText);
                FinalResult *= num2;
                screen.setText(String.format("%.2f", FinalResult));
            }
            if(KeepTrack.equals("/"))
            {
                num2 =  Double.parseDouble(currentText);
                FinalResult /= num2;
                screen.setText(String.format("%.2f", FinalResult));
            }
            KeepTrack = " ";
        }
        
    }
}