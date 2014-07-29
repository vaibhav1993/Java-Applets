import java.applet.*;
import java.awt.*;

public class house2 extends Applet
{

public void init()
{
setBackground(Color.cyan);
setForeground(Color.blue);
}
public void paint(Graphics g)
{
g.drawLine(500,100,300,400);
g.drawLine(500,100,700,400);
g.drawRect(300,400,400,600);
g.drawRect(700,400,1000,600);
g.drawLine(500,100,1500,100);
g.drawLine(1500,100,1700,400);
g.drawLine(400,1000,400,800);
g.drawLine(600,1000,600,800);
g.drawArc(400,700,200,300,-180,-180);
}
}

/*<applet code="house2.class" width=1000 height=1000>
</applet>*/