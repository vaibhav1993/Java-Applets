import java.awt.*;
import java.awt.event.*;

class Loginfrm extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
GridLayout gl;
Button b1;
Loginfrm()
{
l1=new Label("Username");
l2=new Label("Password");
t1=new TextField(10);
t2=new TextField(10);
b1 = new Button("Login");
gl=new GridLayout(3,2);
t2.setEchoChar('*');
setLayout(gl);
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s,s1;
s=t1.getText();
s1=t2.getText();

if((s.equals("Vaibhav"))&&(s1.equals("Tuteja")))
{
Mainfrm m1 = new Mainfrm();
m1.setSize(300,400);
m1.setVisible(true);
dispose();
}
}
}

class Mainfrm extends Frame
{
Menu m1,m2,m3;
MenuItem mi1,mi2,mi3,mi4,mi5;
MenuBar mb;

Mainfrm()
{
myadapter ma = new myadapter(this);
mb=new MenuBar();
setMenuBar(mb);

m1= new Menu("Employee");
m2= new Menu("Department");
m3= new Menu("Display");

mi1= new MenuItem("Insert");
mi2= new MenuItem("Delete");
mi3= new MenuItem("-");
mi4= new MenuItem("By Search");
mi5= new MenuItem("All");

m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m1.add(m3);
m3.add(mi4);
m3.add(mi5);
mb.add(m1);
mb.add(m2);
addWindowListener(ma);
}
}

class frames2
{
public static void main(String args[])
{
Loginfrm f1 = new Loginfrm();
f1.setVisible(true);
f1.setSize(300,200);
}
}