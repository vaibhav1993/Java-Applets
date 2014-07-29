import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mouserect extends Applet implements MouseListener, MouseMotionListener
{
int X1,Y1,X2,Y2;

public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
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
}
/*<applet code="mouserect.class" width=500 height=500>
</applet>*/