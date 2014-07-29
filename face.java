import java.applet.*;
import java.awt.*;

public class face extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.orange);
g.fillOval(50,30,100,100);
g.setColor(Color.red);
g.fillOval(70,45,20,20);
g.fillOval(110,45,20,20);
g.setColor(Color.blue);
g.fillOval(77,55,5,5);
g.fillOval(117,55,5,5);
g.setColor(Color.red);
g.drawLine(100,70,100,100);
g.setColor(Color.red);
g.drawArc(80,95,40,20,180,180);
}
}

/*<applet code="face.class"  width=300 height=300>
</applet>*/