import java.util.*;
import java.applet.*;
import java.awt.*;

public class shapes extends Applet
{
int xcor=70;
int ycor=70;
public void paint(Graphics g)
{
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if((i+j)%2==0)
{
g.drawOval(xcor,ycor,50,50);
xcor=xcor+70;
}
else
{
g.fillOval(xcor,ycor,50,50);
xcor=xcor+70;
}
}
xcor=70;
ycor=ycor+70;
}
}
}

/*<applet code="shapes.class" width=500 height=500>
</applet>*/