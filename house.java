import java.applet.*;
import java.awt.*;

public class house extends Applet
{

public void init()
{
setBackground(Color.cyan);
setForeground(Color.blue);
}
public void paint(Graphics g)
{
g.drawLine(50,10,30,40);
g.drawLine(50,10,70,40);
g.drawRect(30,40,40,60);
g.drawRect(70,40,100,60);
g.drawLine(50,10,150,10);
g.drawLine(150,10,170,40);
g.drawLine(40,100,40,80);
g.drawLine(60,100,60,80);
g.drawArc(40,70,20,30,-180,-180);
}
}

/*<applet code="house.class" width=300 height=300>
</applet>*/