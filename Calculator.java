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
        Font  f2  = new Font(Font.SANS_SERIF,Font.PLAIN, 18);
        this.setFont(f2);
        this.setForeground(new Color(0x505050));
    }
}


public class Calculator extends JFrame implements ActionListener {
    MyBtn[] btn = new MyBtn[24];
    JTextField tf,textField;
    Double num1,num2,result;
    String operator;


    Calculator(){
        this.setTitle("Calculator");
        this.setSize(400,560);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setBackground(new Color(0xE6E6E6));

        //JPanel panel = new JPanel();
        //panel.setBounds(0,0,390,160);
        //panel.setBackground(Color.GRAY);
        //this.add(panel);

        textField = new JTextField();
        textField.setBounds(0,0,385,40);
        textField.setBackground(new Color(0xE6E6E6));
        textField.setBorder(null);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
        this.add(textField);

        tf = new JTextField();
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
        btn[8].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[8].setForeground(new Color(0x0f0f0f));

        btn[9] = new MyBtn("8");
        btn[9].setBackground(Color.WHITE);
        btn[9].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[9].setForeground(new Color(0x0f0f0f));

        btn[10] = new MyBtn("9");
        btn[10].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[10].setBackground(Color.WHITE);
        btn[10].setForeground(new Color(0x0f0f0f));

        btn[11] = new MyBtn("x");

        btn[12] = new MyBtn("4");
        btn[12].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[12].setBackground(Color.WHITE);
        btn[12].setForeground(new Color(0x0f0f0f));

        btn[13] = new MyBtn("5");
        btn[13].setBackground(Color.WHITE);
        btn[13].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[13].setForeground(new Color(0x0f0f0f));

        btn[14] = new MyBtn("6");
        btn[14].setBackground(Color.WHITE);
        btn[14].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[14].setForeground(new Color(0x0f0f0f));

        btn[15] = new MyBtn("-");

        btn[16] = new MyBtn("1");
        btn[16].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[16].setBackground(Color.WHITE);
        btn[16].setForeground(new Color(0x0f0f0f));

        btn[17] = new MyBtn("2");
        btn[17].setBackground(Color.WHITE);
        btn[17].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[17].setForeground(new Color(0x0f0f0f));

        btn[18] = new MyBtn("3");
        btn[18].setBackground(Color.WHITE);
        btn[18].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        btn[18].setForeground(new Color(0x0f0f0f));

        btn[19] = new MyBtn("+");
        btn[20] = new MyBtn("±");

        btn[21] = new MyBtn("0");
        btn[21].setBackground(Color.WHITE);
        btn[21].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
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



    public static void main(String[] args){
        Calculator cal = new Calculator();
    }

    public void setHistoryField(String val){
        textField.setText(tf.getText().concat(val));
    }

    public void setTextField(String val){
        tf.setText(tf.getText().concat(val));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn[0]){
            String per = "%";
        }
        else if (e.getSource() == btn[1]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[2]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[3]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[4]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[5]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[6]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[7]){
            num1 = Double.parseDouble(tf.getText());
            operator = "÷";
            String val = String.valueOf(btn[7].getText());
            setHistoryField(val);
            tf.setText("");
        }
        else if (e.getSource() == btn[8]){
            String val = String.valueOf(btn[8].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[9]){
            String val = String.valueOf(btn[9].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[10]){
            String val = String.valueOf(btn[10].getText());
            setTextField(val);
        }
        //multiply
        else if (e.getSource() == btn[11]){
            num1 = Double.parseDouble(tf.getText());
            operator = "x";
            String val = String.valueOf(btn[11].getText());
            setHistoryField(val);
            tf.setText("");
        }
        else if (e.getSource() == btn[12]){
            String val = String.valueOf(btn[12].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[13]){
            String val = String.valueOf(btn[13].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[14]){
            String val = String.valueOf(btn[14].getText());
            setTextField(val);
        }
        //subtract
        else if (e.getSource() == btn[15]){
            num1 = Double.parseDouble(tf.getText());
            operator = "-";
            String val = String.valueOf(btn[15].getText());
            setHistoryField(val);
            tf.setText("");
        }
        else if (e.getSource() == btn[16]){
            String val = String.valueOf(btn[16].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[17]){
            String val = String.valueOf(btn[17].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[18]){
            String val = String.valueOf(btn[18].getText());
            setTextField(val);
        }
        //plus
        else if (e.getSource() == btn[19]){
            num1 = Double.parseDouble(tf.getText());
            operator = "+";
            String val = String.valueOf(btn[19].getText());
            setHistoryField(val);
            tf.setText("");
        }
        else if (e.getSource() == btn[20]){
            String val = String.valueOf(btn[20].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[21]){
            String val = String.valueOf(btn[21].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[22]){
            String val = String.valueOf(btn[22].getText());
            setTextField(val);
        }
        else if (e.getSource() == btn[23]){
            num2 = Double.parseDouble(tf.getText());
            String val = String.valueOf(num1) + " "+ String.valueOf(operator) + " " +String.valueOf(num2) + " =";
            textField.setText(val);
            switch (operator){
                case "+":
                    result = num1+num2;
                    break;
                case "-":
                    result = num1-num2;
                    break;
                case "x":
                    result = num1*num2;
                    break;
                case "÷":
                    result = num1/num2;
                    break;
            }
            tf.setText(String.valueOf(result));
            num1=result;

        }
    }
}