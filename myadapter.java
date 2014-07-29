import java.awt.*;
import java.awt.event.*;

class myadapter extends WindowAdapter
{
Frame myframe;

myadapter(Frame f)
{
myframe=f;
}

public void windowClosing(WindowEvent e)
{
myframe.dispose();
}
}