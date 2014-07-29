import java.applet.*;
import java.awt.*;

public class polygons extends Applet
{
public void paint(Graphics g)
{
int X[]={50,100,80,200,170,50,90,90,20,20};
int Y[]={10,10,40,40,100,110,80,60,60,30};

g.drawPolygon(X,Y,10);
}
}

/*<applet code="polygons.class" width=300 height=300>
</applet>*/