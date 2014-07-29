import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class fontset extends Applet implements ItemListener
{
Choice c1; TextField t1; Checkbox ch1,ch2;

public void init()
{
c1=new Choice();

t1=new TextField(20);

ch1=new Checkbox("BOLD");

ch2=new Checkbox("ITALIC");

c1.addItem("10");
c1.addItem("12");
c1.addItem("14");
c1.addItem("16");
c1.addItem("18");
c1.addItem("20");

add(t1);

add(c1);
c1.addItemListener(this);

add(ch1);
ch1.addItemListener(this);
add(ch2);
ch2.addItemListener(this);

}

public void itemStateChanged(ItemEvent e)
{
int i,j;
j=0;

i=Integer.parseInt(c1.getSelectedItem());
if(ch1.getState())
j=Font.BOLD;
if(ch2.getState())
j=j+Font.ITALIC;

Font f = new Font("Arial",j,i);

t1.setFont(f);
}
}

/*<applet code="fontset.class" width=1000 height=1000>
</applet>*/