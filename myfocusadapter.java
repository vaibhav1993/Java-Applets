import java.awt.*;
import java.awt.event.*;

class myfocusadapter extends FocusAdapter
{
TextField tf;

myfocusadapter(TextField t)
{
tf=t;
}

public void focusGained(FocusEvent e)
{
TextField t = (TextField) e.getSource();
t.setBackground(Color.cyan);
}

public void focusLost(FocusEvent e)
{
TextField t= (TextField) e.getSource();
t.setBackground(Color.white);
}
}
