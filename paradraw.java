import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class paradraw extends Applet implements ActionListener, ItemListener
{
TextField t1,t2,t3,t4; Label l1,l2,l3,l4;
int i,j,k,l;

Checkbox cb1; Button b1;

public void init()
{
t1=new TextField(5);
t2=new TextField(5);
t3=new TextField(5);
t4=new TextField(5);


l1=new Label("X");
l2=new Label("Y");
l3=new Label("H");
l4=new Label("W");
cb1=new Checkbox("Rectangle");

b1=new Button("Draw");

add(t1);
add(l1);
add(t2);
add(l2);
add(t3);
add(l3);
add(t4);
add(l4);

add(cb1);
cb1.addItemListener(this);

add(b1);
b1.addActionListener(this);
}

public void itemStateChanged(ItemEvent e)
{
t4.setVisible(cb1.getState());
l4.setVisible(cb1.getState());
}

public void actionPerformed(ActionEvent e)
{
i=Integer.parseInt(t1.getText());
j=Integer.parseInt(t2.getText());
k=Integer.parseInt(t3.getText());
if(cb1.getState())
{
l=Integer.parseInt(t4.getText());
}

if(e.getActionCommand()=="Draw")
repaint();
}

public void paint(Graphics g)
{


if(cb1.getState())
{
g.drawRect(i,j,k,l);
}

else
g.drawRect(i,j,k,k);
}
}
/*<applet code="paradraw.class" width=1000 height=100>
</applet>*/