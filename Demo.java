import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JLabel l1;
    JLabel l2;
    JButton equalbtn;
    Calculator(){
        setSize(300,100);
        setLocationRelativeTo(null);
        JPanel p1=new JPanel(new FlowLayout());
        t1=new JTextField(5);
        t2=new JTextField(5);
        t3=new JTextField(5);
        l1=new JLabel("/");
        equalbtn=new JButton("=");
        l2=new JLabel("");
        
        p1.add(t1);
        p1.add(l1);
        p1.add(t2);
        p1.add(equalbtn);
        p1.add(l2);
        add("Center",p1);
        
        
        
        equalbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String x1=t1.getText();
                String x2=t2.getText();
               int num1=Integer.parseInt(x1);    
               int num2=Integer.parseInt(x2);
                
                l2.setText(""+num1/num2);    
            }
        });
        
        setVisible(true);
    }
}
class Demo{
    public static void main(String args[]){
       Calculator c1=new Calculator();
    }
}
