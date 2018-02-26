package Calculate;

import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr, bxsqr, bxcub, bxsqrt, bxlog, sinDeg, sinRad, cosDeg, cosRad;

    static double firstNum = 0, secondNum = 0, result = 0;
    static int operator = 0;

    @SuppressWarnings("LeakingThisInConstructor")
    Calculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bsub = new JButton("-");
        badd = new JButton("+");
        bdec = new JButton(".");
        beq = new JButton("=");
        bdel = new JButton("Delete");
        bclr = new JButton("Clear");

        bxsqr = new JButton("X^2");
        bxcub = new JButton("X^3");
        bxsqrt = new JButton("sqrt");
        bxlog = new JButton("log10");
        
        sinDeg = new JButton("sin(deg)");
        sinRad = new JButton("sin(rad)");
        cosDeg = new JButton("cos(deg)");
        cosRad = new JButton("cos(rad)");

        textField.setBounds(30, 40, 350, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        bdiv.setBounds(250, 100, 50, 40);
        bxsqr.setBounds(320, 100, 73, 40);
        sinDeg.setBounds(410, 100, 95, 40);

        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bmul.setBounds(250, 170, 50, 40);
        bxcub.setBounds(320, 170, 73, 40);
        sinRad.setBounds(410, 170, 95, 40);

        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);
        bxsqrt.setBounds(320, 240, 73, 40);
        cosDeg.setBounds(410, 240, 95, 40);

        bdec.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);
        bxlog.setBounds(320, 310, 73, 40);
        cosRad.setBounds(410, 310, 95, 40);

        bdel.setBounds(60, 380, 100, 40);
        bclr.setBounds(180, 380, 100, 40);

        frame.add(textField);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bsub);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bdel);
        frame.add(bclr);

        frame.add(bxsqr);
        frame.add(bxcub);
        frame.add(bxsqrt);
        frame.add(bxlog);
        
        frame.add(sinDeg);
        frame.add(sinRad);
        frame.add(cosDeg);
        frame.add(cosRad);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(420+210, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);

        bxsqr.addActionListener(this);
        bxcub.addActionListener(this);
        bxsqrt.addActionListener(this);
        bxlog.addActionListener(this);
        
        sinDeg.addActionListener(this);
        sinRad.addActionListener(this);
        cosDeg.addActionListener(this);
        cosRad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bxsqr) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 5;
            textField.setText("");
            switch (operator) {
                case 5:
                    result = Math.pow(firstNum, 2.0);
                    break;
            }
            textField.setText("" + result);

        }
        if (e.getSource() == bxcub) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 6;
            textField.setText("");

            switch (operator) {
                case 6:
                    result = Math.pow(firstNum, 3.0);
                    break;
            }
            textField.setText("" + result);
        }
        if (e.getSource() == bxsqrt) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 7;
            textField.setText("");

            switch (operator) {
                case 7:
                    result = Math.sqrt(firstNum);
                    break;
            }
            textField.setText("" + result);
        }
        if (e.getSource() == bxlog) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 8;
            textField.setText("");

            switch (operator) {
                case 8:
                    result = Math.log10(firstNum);
                    break;
            }
            textField.setText("" + result);
        }
        
        
        
        
        
        
        //Trig functions
        if (e.getSource() == sinDeg) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 9;
            textField.setText("");

            switch (operator) {
                case 9:
                   double angle = 90 ;
                   result  = Math.sin( Math.toRadians( angle ) ) ;

                   // result = rads * pinum;
                    break;
            }
            textField.setText("" + result);
        }
        
        if (e.getSource() == sinRad) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 10;
            textField.setText("");

            switch (operator) {
                case 10:
                    result = Math.sin(firstNum);
                    break;
            }
            textField.setText("" + result);
        }
        
        if (e.getSource() == cosDeg) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 11;
            textField.setText("");

            switch (operator) {
                case 11:
                    double rads = Math.cos(firstNum);
                    double pinum = 180/Math.PI;
                    
                    result = rads * pinum;
                    break;
            }
            textField.setText("" + result);
        }
        
        if (e.getSource() == cosRad) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 12;
            textField.setText("");

            switch (operator) {
                case 12:
                    result = Math.cos(firstNum);
                    break;
            }
            textField.setText("" + result);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        if (e.getSource() == b1) {
            textField.setText(textField.getText().concat("1"));
        }

        if (e.getSource() == b2) {
            textField.setText(textField.getText().concat("2"));
        }

        if (e.getSource() == b3) {
            textField.setText(textField.getText().concat("3"));
        }

        if (e.getSource() == b4) {
            textField.setText(textField.getText().concat("4"));
        }

        if (e.getSource() == b5) {
            textField.setText(textField.getText().concat("5"));
        }

        if (e.getSource() == b6) {
            textField.setText(textField.getText().concat("6"));
        }

        if (e.getSource() == b7) {
            textField.setText(textField.getText().concat("7"));
        }

        if (e.getSource() == b8) {
            textField.setText(textField.getText().concat("8"));
        }

        if (e.getSource() == b9) {
            textField.setText(textField.getText().concat("9"));
        }

        if (e.getSource() == b0) {
            textField.setText(textField.getText().concat("0"));
        }

        if (e.getSource() == bdec) {
            textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == badd) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 1;
            textField.setText("");
        }

        if (e.getSource() == bsub) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 2;
            textField.setText("");
        }

        if (e.getSource() == bmul) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 3;
            textField.setText("");
        }

        if (e.getSource() == bdiv) {
            firstNum = Double.parseDouble(textField.getText());
            operator = 4;
            textField.setText("");
        }

        if (e.getSource() == beq) {
            secondNum = Double.parseDouble(textField.getText());

            switch (operator) {
                case 1:
                    result = firstNum + secondNum;
                    break;

                case 2:
                    result = firstNum - secondNum;
                    break;

                case 3:
                    result = firstNum * secondNum;
                    break;

                case 4:
                    result = firstNum / secondNum;
                    break;

                default:
                    result = 0;
            }

            textField.setText("" + result);
        }

        if (e.getSource() == bclr) {
            textField.setText("");
        }

        if (e.getSource() == bdel) {
            /*  i<s.length() - 1
             *  Because the index starts at 0, i has to start at zero to get the first char
             *  s.length() doesnt start at 0, so it is 1 too high for the index, so you need - 1
             */
            String s = textField.getText();
            textField.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                textField.setText(textField.getText() + s.charAt(i));

            }
        }
    }

    public static void main(String... s) {
        
         
       

        new Calculator();
    }
}


   /* Testing math methods
        double mathTest = Math.pow(10.0, 2.0);
        System.out.println("10^2 = " + mathTest);

        mathTest = Math.sqrt(25.0);
        System.out.println("sqrt(25) = " + mathTest);

        mathTest = Math.pow(25.0, .5);
        System.out.println("math.pow(.5) = " + mathTest);

        mathTest = Math.pow(10.0, 2.5);
        System.out.println("math.pow(2.5) = " + mathTest);

        mathTest = Math.log10(100.0);
        System.out.println("log10(5.0) = " + mathTest);


        String baseTest = Integer.toHexString(255);
        System.out.print(baseTest);
         */
