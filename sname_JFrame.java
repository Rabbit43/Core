
main server url : 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class sname_JFrame extends JFrame implements ActionListener
{
JTextField t1,t2,t
JLabel l1,l2;
JButton b,b23 ,fj
sname_JFrame()

l1=new JLabel("Enter the attendance mark for 100");
l2=new JLabel("Computed attendance mark for 10 marks");
l3=new JLabel("Eligibility for writing the end semester");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField(20);
b=new JButton("Find");
b1=new JButton("Clear");
b.addActionListener(this);
b1.addActionListener(this);
JPanel p=new JPanel(new GridLayout(4,2));
p.add(l1);p.add(t1);
p.add(l2);p.add(t2);
p.add(l3);p.add(t3);
p.add(b);p.add(b1);
Container c=getContentPane();
c.add(p);
}

public void actionPerformed(ActionEvent ob)
{
if(ob.getSource()==b)
{
int num=Integer.parseInt(t1.getText());
if(num>=75&&num<80)
{ t2.setText(2+""); t3.setText("You are Eligible"); }
else if(num>=80&&num<84)
{ t2.setText(4+""); t3.setText("You are Eligible"); }
else if(num>=85&&num<89)
{ t2.setText(6+""); t3.setText("You are Eligible"); }
else if(num>=90&&num<94)
{ t2.setText(8+""); t3.setText("You are Eligible"); }
else if(num>=90&&num<94)
{ t2.setText(10+""); t3.setText("You are Eligible"); }
else 
{ t2.setText(0+""); t3.setText("You are not Eligible"); }

}
else
{
t1.setText(""); t2.setText(""); t3.setText("");
}
}

public static void main(String args[])
{
sname_JFrame f=new sname_JFrame();
f.setSize(400,350);
f.setVisible(true);
}
}
dwd