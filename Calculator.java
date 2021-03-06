import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyBtn extends JButton{
    MyBtn(String str){
        this.setBorder(null);
        this.setFocusable(false);
        this.setBackground(new Color(0xF1F1F1));
        this.setText(str);
        Font  f2  = new Font(Font.SANS_SERIF,Font.PLAIN, 20);
        this.setFont(f2);
        this.setForeground(new Color(0x505050));
    }
}


public class Calculator extends JFrame implements ActionListener {
    MyBtn[] btn = new MyBtn[24];
    JTextField tf,textField;
    Double num1,num2,result;
    String operator;
    Boolean flag = false;
    Boolean flamg = true;
    Boolean flg = true;


    Calculator(){
        this.setTitle("Calculator");
        this.setSize(400,560);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setBackground(new Color(0xE6E6E6));

        textField = new JTextField();
        textField.setBounds(0,0,385,40);
        textField.setBackground(new Color(0xE6E6E6));
        textField.setBorder(null);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,18));
        this.add(textField);

        tf = new JTextField("0");
        tf.setBounds(0,40,385,130);
        tf.setBackground(new Color(0xE6E6E6));
        tf.setBorder(null);
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setFont(new Font(Font.SANS_SERIF,Font.BOLD,36));
        this.add(tf);


        JPanel panel2 = new JPanel();
        panel2.setBounds(0,170,390,350);
        panel2.setBackground(Color.CYAN);
        panel2.setVisible(true);
        panel2.setBackground(new Color(0xE6E6E6));
        panel2.setLayout(new GridLayout(6,4,2,2));

        btn[0] = new MyBtn("%");
        btn[1]=new MyBtn("√");
        btn[2]=new MyBtn("x²");
        btn[3] = new MyBtn("1/x");
        btn[4] = new MyBtn("CE");
        btn[5] = new MyBtn("C");
        btn[6] = new MyBtn("⌫");
        btn[7] = new MyBtn("÷");

        btn[8] = new MyBtn("7");
        btn[8].setBackground(Color.WHITE);
        btn[8].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[8].setForeground(new Color(0x0f0f0f));

        btn[9] = new MyBtn("8");
        btn[9].setBackground(Color.WHITE);
        btn[9].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[9].setForeground(new Color(0x0f0f0f));

        btn[10] = new MyBtn("9");
        btn[10].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[10].setBackground(Color.WHITE);
        btn[10].setForeground(new Color(0x0f0f0f));

        btn[11] = new MyBtn("x");

        btn[12] = new MyBtn("4");
        btn[12].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[12].setBackground(Color.WHITE);
        btn[12].setForeground(new Color(0x0f0f0f));

        btn[13] = new MyBtn("5");
        btn[13].setBackground(Color.WHITE);
        btn[13].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[13].setForeground(new Color(0x0f0f0f));

        btn[14] = new MyBtn("6");
        btn[14].setBackground(Color.WHITE);
        btn[14].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[14].setForeground(new Color(0x0f0f0f));

        btn[15] = new MyBtn("-");

        btn[16] = new MyBtn("1");
        btn[16].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[16].setBackground(Color.WHITE);
        btn[16].setForeground(new Color(0x0f0f0f));

        btn[17] = new MyBtn("2");
        btn[17].setBackground(Color.WHITE);
        btn[17].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[17].setForeground(new Color(0x0f0f0f));

        btn[18] = new MyBtn("3");
        btn[18].setBackground(Color.WHITE);
        btn[18].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[18].setForeground(new Color(0x0f0f0f));

        btn[19] = new MyBtn("+");
        btn[20] = new MyBtn("±");

        btn[21] = new MyBtn("0");
        btn[21].setBackground(Color.WHITE);
        btn[21].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btn[21].setForeground(new Color(0x0f0f0f));

        btn[22] = new MyBtn(".");
        btn[23] = new MyBtn("=");

        for(int i=0;i<24;i++)
        {
            panel2.add(btn[i]);
            btn[i].addActionListener(this);
        }

        this.add(panel2);
        this.revalidate();
        this.repaint();
    }

    //Main Method
    public static void main(String[] args){
        Calculator cal = new Calculator();
    }

    //Set History Text Field
    public void setHistoryField(String val){
        textField.setText(tf.getText().concat(val));
    }

    //Set Text Field Function
    public void setTextField(String val){
        if(flamg){
            tf.setText("");
        }
        tf.setText(tf.getText().concat(val));
        flamg=false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //%
        if (e.getSource() == btn[0]){
            num1 = Double.parseDouble(tf.getText());
            result = num1/100;
            tf.setText(String.valueOf(result));
            textField.setText("");
        }
        //sqrt
        else if (e.getSource() == btn[1]){
            num1 = Double.parseDouble(tf.getText());
            result = Math.sqrt(num1);
            tf.setText(String.valueOf(result));
            String val = "sqrt("+String.valueOf(num1)+")";
            textField.setText(val);
            flag=true;
        }
        //sqr
        else if (e.getSource() == btn[2]){
            num1 = Double.parseDouble(tf.getText());
            result = num1 * num1;
            tf.setText(String.valueOf(result));
            String val = "sqr("+String.valueOf(num1)+")";
            textField.setText(val);
            flag=true;
        }
        //1/x
        else if (e.getSource() == btn[3]){
            try {
                num1 = Double.parseDouble(tf.getText());
                result = 1 / num1;
                tf.setText(String.valueOf(result));
                String val = "1/(" + String.valueOf(num1) + ")";
                textField.setText(val);
                flag = true;
            }
            catch(ArithmeticException exc){
                tf.setText("Cannot Divide by 0");
            }
        }
        //CE
        else if (e.getSource() == btn[4]){
            tf.setText("0");
            flamg=true;
            flg=true;
        }
        //C
        else if (e.getSource() == btn[5]){
            tf.setText("0");
            textField.setText("");
            flamg=true;
            flg=true;
        }
        //esc
        else if (e.getSource() == btn[6]){
            String val = tf.getText();
            if(val.length()-1 == 0){
                tf.setText("0");
                flamg = true;
            }
            else {
                tf.setText("");
                for (int i = 0; i < val.length() - 1; i++) {
                    tf.setText(tf.getText() + val.charAt(i));
                }
            }
        }
        //Divide
        else if (e.getSource() == btn[7]){
            try {
                String v = textField.getText();
                if(! v.contains("÷")) {
                    num1 = Double.parseDouble(tf.getText());
                    operator = "÷";
                    String val = String.valueOf(btn[7].getText());
                    setHistoryField(val);
                    tf.setText("");
                }
            }catch(ArithmeticException excp){
                tf.setText("Cannot Divide by 0");
            }
        }
        //7
        else if (e.getSource() == btn[8]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[8].getText());
            setTextField(val);
        }
        //8
        else if (e.getSource() == btn[9]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[9].getText());
            setTextField(val);
        }
        //9
        else if (e.getSource() == btn[10]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[10].getText());
            setTextField(val);
        }
        //multiply
        else if (e.getSource() == btn[11]){
            String v = textField.getText();
            if(! v.contains("x")) {
                num1 = Double.parseDouble(tf.getText());
                operator = "x";
                String val = String.valueOf(btn[11].getText());
                setHistoryField(val);
                tf.setText("");
            }
        }
        //4
        else if (e.getSource() == btn[12]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[12].getText());
            setTextField(val);
        }
        //5
        else if (e.getSource() == btn[13]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[13].getText());
            setTextField(val);
        }
        //6
        else if (e.getSource() == btn[14]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[14].getText());
            setTextField(val);
        }
        //subtract
        else if (e.getSource() == btn[15]){
            String v = textField.getText();
            if(! v.contains("-")) {
                num1 = Double.parseDouble(tf.getText());
                operator = "-";
                String val = String.valueOf(btn[15].getText());
                setHistoryField(val);
                tf.setText("");
            }
        }
        //1
        else if (e.getSource() == btn[16]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[16].getText());
            setTextField(val);
        }
        //2
        else if (e.getSource() == btn[17]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[17].getText());
            setTextField(val);
        }
        //3
        else if (e.getSource() == btn[18]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[18].getText());
            setTextField(val);
        }
        //plus
        else if (e.getSource() == btn[19]){
            String v = textField.getText();
            if(! v.contains("+")) {
                num1 = Double.parseDouble(tf.getText());
                operator = "+";
                String val = String.valueOf(btn[19].getText());
                setHistoryField(val);
                tf.setText("");
            }
        }
        //+/-
        else if (e.getSource() == btn[20]){
            double val = Double.parseDouble(tf.getText());
            val *= -1;
            tf.setText(String.valueOf(val));
        }
        //0
        else if (e.getSource() == btn[21]){
            if(flag){
                tf.setText("");
                textField.setText("");
                num1=0.0;
                flag=false;
            }
            String val = String.valueOf(btn[21].getText());
            setTextField(val);
        }
        //dot
        else if (e.getSource() == btn[22]){
            String val = tf.getText();
            if(! val.contains(".")){
                setTextField(String.valueOf(btn[22].getText()));
            }
        }
        else if (e.getSource() == btn[23]){
            if(flg) {
                num2 = Double.parseDouble(tf.getText());
                String val = String.valueOf(num1) + " " + String.valueOf(operator) + " " + String.valueOf(num2) + " =";
                textField.setText(val);
                flg = false;
            }
            else{
                String val = String.valueOf(num1) + " " + String.valueOf(operator) + " " + String.valueOf(num2) + " =";
                textField.setText(val);
            }
            switch (operator){
                case "+":
                    result = num1+num2;
                    flamg=true;
                    break;
                case "-":
                    result = num1-num2;
                    flamg=true;
                    break;
                case "x":
                    result = num1*num2;
                    flamg=true;
                    break;
                case "÷":
                    result = num1/num2;
                    flamg=true;
                    break;
            }
            tf.setText(String.valueOf(result));
            num1=result;
        }
    }
}