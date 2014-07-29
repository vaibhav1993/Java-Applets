import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class focusadap extends Applet
{
TextField t1,t2,t3;

public void init()
{
t1 = new TextField(20);
t2 = new TextField(20);
t3 = new TextField(20);

add(t1);
add(t2);
add(t3);

t1.addFocusListener(new myfocusadapter(t1));
t2.addFocusListener(new myfocusadapter(t2));
t3.addFocusListener(new myfocusadapter(t3));
}
}

/*<applet code="focusadap.class" width=500 height=500>
</applet>*/