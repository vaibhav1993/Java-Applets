import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class listshape2 extends Applet implements ItemListener, MouseListener, MouseMotionListener
{
Choice c1,c2,c3; Label l1,l2;

String s="Oval";

int X1,Y1,X2,Y2;

public void init()
{
l1=new Label("Coordinate-X");
l2=new Label("Coordinate-Y");

c1=new Choice();
c2=new Choice();
c3=new Choice();

c1.addItem("Oval");
c1.addItem("Rectangle");
c1.addItem("Line");

c2.addItem("180");
c2.addItem("-180");
c2.addItem("90");
c2.addItem("-90");

c3.addItem("180");
c3.addItem("-180");
c3.addItem("90");
c3.addItem("-90");

add(c1);
c1.addItemListener(this);

add(c2);
add(l1);
add(c3);
add(l2);

addMouseListener(this);
addMouseMotionListener(this);
}

public void itemStateChanged(ItemEvent e)
{
s=c1.getSelectedItem();
}

public void mouseEntered(MouseEvent e)
{
}

public void mouseExited(MouseEvent e)
{
}

public void mousePressed(MouseEvent e)
{
X1=e.getX();
Y1=e.getY();
}

public void mouseReleased(MouseEvent e)
{
}

public void mouseClicked(MouseEvent e)
{
}

public void mouseMoved(MouseEvent e)
{
}

public void mouseDragged(MouseEvent e)
{
X2=e.getX();
Y2=e.getY();

repaint();
}

public void paint(Graphics g)
{
if(s.equals("Rectangle"))
{

if((X1>X2)||(Y1>Y2))
{
g.drawRect(X2,Y1,-(X2-X1),(Y2-Y1));
}

if((X2>X1)||(Y2>Y1))
{
g.drawRect(X1,Y2,(X2-X1),-(Y2-Y1));
}

if((X2>X1)||(Y1>Y2))
{
g.drawRect(X1,Y1,(X2-X1),(Y2-Y1));
}

if((X1>X2)||(Y2>Y1))
{
g.drawRect(X2,Y2,-(X2-X1),-(Y2-Y1));
}
}
else if(s.equals("Oval"))
{
if((X1>X2)||(Y1>Y2))
{
g.drawOval(X2,Y1,-(X2-X1),(Y2-Y1));
}

if((X2>X1)||(Y2>Y1))
{
g.drawOval(X1,Y2,(X2-X1),-(Y2-Y1));
}

if((X2>X1)||(Y1>Y2))
{
g.drawOval(X1,Y1,(X2-X1),(Y2-Y1));
}

if((X1>X2)||(Y2>Y1))
{
g.drawOval(X2,Y2,-(X2-X1),-(Y2-Y1));
}
}

else if(s.equals("Line"))
{
g.drawLine(X1,Y1,X2,Y2);
}
}
}
/*<applet code="listshape2.class" width=500 height=500>
</applet>*/