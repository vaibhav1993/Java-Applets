import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Empfrm extends Frame implements ActionListener
{
Connection c;
Statement st;
ResultSet rs;

Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4;
GridLayout gl;
Button b1;
Empfrm()
{
gl= new GridLayout(5,2);
l1=new Label("Eno");
l2=new Label("Ename");
l3=new Label("Eadd");
l4=new Label("Eage");
l5=new Label("abc");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
t4=new TextField(10);
b1 = new Button("Next");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(b1);
setLayout(gl);
b1.addActionListener(this);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
c = DriverManager.getConnection("jdbc:odbc:myemp");
st = c.createStatement();
rs = st.executeQuery("Select * from Emp");

if(rs.next())
{
t1.setText(rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(""+rs.getInt(4));
l5.setText("Record No."+rs.getRow());
}
}
catch(Exception g)
{System.out.println(g);
}
//catch(SQLException sl)
//{}
}

public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("Next"))
{
try
{
if(rs.next())
{
t1.setText(rs.getString(1));
t2.setText(rs.getString(2));
t3.setText(rs.getString(3));
t4.setText(""+rs.getInt(4));
l5.setText("Record No."+rs.getRow());
}
else
l5.setText("Last Record");
}
catch(Exception s)
{System.out.println(s);
}
}
}
}

class frames3
{
public static void main(String args[])
{
Empfrm f1 = new Empfrm();
f1.setVisible(true);
f1.setSize(300,200);
}
}