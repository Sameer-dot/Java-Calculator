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
    JTextField tf;

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

        JTextField tfield = new JTextField();
        tfield.setBounds(0,0,390,40);
        tfield.setBackground(Color.black);
        tfield.setBorder(null);
        tfield.setEditable(false);
        this.add(tfield);

        tf = new JTextField();
        tf.setBounds(0,40,385,130);
        tf.setBackground(new Color(0xE6E6E6));
        tf.setBorder(null);
        tf.setEditable(false);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
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

    public void setTextField(String val){
        tf.setText(val);
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
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[8]){
            tf.setText(tf.getText().concat(String.valueOf(btn[8].getText())));
        }
        else if (e.getSource() == btn[9]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[10]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[11]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[12]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[13]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[14]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[15]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[16]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[17]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[18]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[19]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[20]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[21]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[22]){
            System.out.print("Button dab gya");
        }
        else if (e.getSource() == btn[23]){
            System.out.print("Button dab gya");
        }
    }
}