//By VAIBHAV TUTEJA
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends Applet implements ActionListener
{
GridLayout gl,gl2; BorderLayout bl; Panel p1,p2; String s; String s1="default"; String s2="pop";
String str="abc";
Button b[],b1,b2; TextField t1,t2; int r,k,j,h,x; int count=0; int opr=0; Double rf,kf,hf,jf,xf; int dota=0;

public void init()
{
int i;
gl = new GridLayout(4,4);
gl2 = new GridLayout(2,2);
bl = new BorderLayout();
p1 = new Panel();
p2 = new Panel();
t2 = new TextField(20);
t2.setEditable(false);
setLayout(bl);
p1.setLayout(gl);
p2.setLayout(gl2);
t1=new TextField(20);
t1.setText("0");
t1.setEditable(false);
b1=new Button("clear");
b2=new Button("<--");
b=new Button[16];

b[0]=new Button("1");
b[1]=new Button("2");
b[2]=new Button("3");
b[3]=new Button("+");
b[4]=new Button("4");
b[5]=new Button("5");
b[6]=new Button("6");
b[7]=new Button("-");
b[8]=new Button("7");
b[9]=new Button("8");
b[10]=new Button("9");
b[11]=new Button("*");
b[12]=new Button(".");
b[13]=new Button("0");
b[14]=new Button("=");
b[15]=new Button("/");

Font f= new Font("Courier",Font.BOLD,18);
for(i=0;i<16;i++)
{
p1.add(b[i]);
b[i].addActionListener(this);
b[i].setBackground(Color.white);
b[i].setFont(f);
}
p2.add(b1);
p2.add(t2);
p2.add(b2);
p2.add(t1);

t1.setBackground(Color.cyan);
t1.setFont(f);
t2.setFont(f);
t2.setBackground(Color.cyan);
b1.addActionListener(this);
b1.setBackground(Color.blue);
b1.setForeground(Color.white);
b1.setFont(f);
b2.setFont(f);
b2.addActionListener(this);
b2.setBackground(Color.red);
b2.setForeground(Color.white);
add(p2,BorderLayout.NORTH);
add(p1);
}

public void actionPerformed(ActionEvent e)
{
s=e.getActionCommand();
if((t1.getText().indexOf(".")!=-1)||(t2.getText().indexOf(".")!=-1))
{
if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
{
if(t1.getText().equals("0"))
{
if(s.equals("-"))
t2.setText(t1.getText()+s);
}
else if((t1.getText().equals(""+rf))&&(t2.getText().equals(rf+s1)))
{
t2.setText(t1.getText()+s);
s1=s;
}
else if((!t1.getText().equals("0"))&&(!t1.getText().equals("-")))
{
count=0;
dota=0;
opr++;
if(opr==1)
{
rf=Double.parseDouble(t1.getText());
if(t2.getText().equals("0-"))
{
rf=-rf;
t2.setText("-"+t1.getText()+s);
}
else
t2.setText(t1.getText()+s);
t1.setText(""+rf);
s1=s;
}
else if(opr>1)
{
if(rf==0.0&&r!=0)
rf=0.0+r;
if(s1.equals("+"))
{kf=rf+hf; rf=kf;}
else if(s1.equals("-"))
{kf=rf-hf; rf=kf;}
else if(s1.equals("*"))
{kf=rf*hf; rf=kf;}
else if(s1.equals("/"))
{kf=rf/hf; rf=kf;}
else
{
if(t2.getText().indexOf("-")!=-1)
kf=-hf;
else
kf=hf;
}
t2.setText(t2.getText()+t1.getText()+s);
t1.setText(""+kf);
s1=s;
}
}
}
else if(s.equals("="))
{
if((t1.getText().equals("0"))&&(!s1.equals("-")))
t1.setText(t1.getText());
else
{
if(rf==0.0&&r!=0)
rf=0.0+r;
opr=0;
count++;
str=t1.getText();
if(str.indexOf(s1)!=-1)
{
if(s1.equals("+"))
kf=rf+rf;
else if(s1.equals("-"))
kf=rf-rf;
else if(s1.equals("*"))
kf=rf*rf;
else if(s1.equals("/"))
kf=rf/rf;
}
else if((count==1))
{
jf=Double.parseDouble(str);
if(s1.equals("+"))
{kf=rf+jf; rf=kf;}
else if(s1.equals("-"))
{kf=rf-jf; rf=kf;}
else if(s1.equals("*"))
{kf=rf*jf; rf=kf;}
else if(s1.equals("/"))
{kf=rf/jf; rf=kf;}
else
{
if(t2.getText().indexOf("-")!=-1)
{kf=-jf; jf=kf; xf=jf;}
else
kf=jf;
}
}
else if(count>1)
{
if(s1.equals("+"))
{kf=rf+jf; rf=kf;}
else if(s1.equals("-"))
{kf=rf-jf; rf=kf;}
else if(s1.equals("*"))
{kf=rf*jf; rf=kf;}
else if(s1.equals("/"))
{kf=rf/jf; rf=kf;}
//else
//kf=jf;
else if((t2.getText().equals(""))&&(t1.getText().indexOf("-")!=-1))
kf=jf+xf; jf=kf;
}

t1.setText(""+kf);
t2.setText("");
s2=s;
dota=0;
}
}
else if(s.equals("<--"))
bckspc();
else if(s.equals("clear"))
{
s1="default";
s2="pop";
hf=rf=kf=jf=0.0;
dota=opr=count=0;
t1.setText("0");
t2.setText("");
}
else if(s.equals("."))
{
dota++;
if(dota==1)
{
if((t2.getText().equals(""))&&(t1.getText().equals("0")))
t1.setText(t1.getText()+s);
else if((t1.getText().equals(""+rf))&&(t2.getText().equals(rf+s1)))
t1.setText("0"+s);
else if((!t2.getText().equals(""))&&(!t1.getText().equals("")))
t1.setText(t1.getText()+s);
else
t1.setText("0"+s);
}
}
else
{
if((t1.getText().equals("0"))&&(t2.getText().equals("")))
t1.setText(s);
else if((t2.getText().indexOf("+")!=-1)||(t2.getText().indexOf("-")!=-1)||(t2.getText().indexOf("*")!=-1)||(t2.getText().indexOf("/")!=-1))
{
if(t1.getText().equals((""+rf)))
t1.setText(s);
else
t1.setText(t1.getText()+s);
hf=Double.parseDouble(t1.getText());
}
else if(s2.equals("="))
{
t1.setText(s);
s2="pop";
}
else
{
t1.setText(t1.getText()+s);
}
}
}

//for integers

else
{
if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
{
if(t1.getText().equals("0"))
{
if(s.equals("-"))
t2.setText(t1.getText()+s);
}
else if((t1.getText().equals(""+r))&&(t2.getText().equals(r+s1)))
{
t2.setText(t1.getText()+s);
s1=s;
}
else if((!t1.getText().equals("0"))&&(!t1.getText().equals("-")))
{
count=0;
opr++;
if(opr==1)
{
r=Integer.parseInt(t1.getText());
if(t2.getText().equals("0-"))
{
r=-r;
t2.setText("-"+t1.getText()+s);
}
else
t2.setText(t1.getText()+s);
t1.setText(""+r);
s1=s;
}
else if(opr>1)
{
if(s1.equals("+"))
{k=r+h; r=k;}
else if(s1.equals("-"))
{k=r-h; r=k;}
else if(s1.equals("*"))
{k=r*h; r=k;}
else if(s1.equals("/"))
{k=r/h; r=k;}
else
{
if(t2.getText().indexOf("-")!=-1)
k=-h;
else
k=h;
}
t2.setText(t2.getText()+t1.getText()+s);
t1.setText(""+k);
s1=s;
}
}
}
else if(s.equals("="))
{
if((t1.getText().equals("0"))&&(!s1.equals("-")))
t1.setText(t1.getText());
else
{
opr=0;
count++;
str=t1.getText();
if(str.indexOf(s1)!=-1)
{
if(s1.equals("+"))
k=r+r;
else if(s1.equals("-"))
k=r-r;
else if(s1.equals("*"))
k=r*r;
else if(s1.equals("/"))
k=r/r;
}
else if((count==1))
{
j=Integer.parseInt(str);
if(s1.equals("+"))
{k=r+j; r=k;}
else if(s1.equals("-"))
{k=r-j; r=k;}
else if(s1.equals("*"))
{k=r*j; r=k;}
else if(s1.equals("/"))
{k=r/j; r=k;}
else
{
if(t2.getText().indexOf("-")!=-1)
{k=-j; j=k; x=j;}
else
k=j;
}
}
else if(count>1)
{
if(s1.equals("+"))
{k=r+j; r=k;}
else if(s1.equals("-"))
{k=r-j; r=k;}
else if(s1.equals("*"))
{k=r*j; r=k;}
else if(s1.equals("/"))
{k=r/j; r=k;}
//else
//k=j;
else if((t2.getText().equals(""))&&(t1.getText().indexOf("-")!=-1))
k=j+x; j=k;
}

t1.setText(""+k);
t2.setText("");
s2=s;
dota=0;
}
}
else if(s.equals("<--"))
bckspc();
else if(s.equals("clear"))
{
s1="default";
s2="pop";
dota=h=opr=r=k=j=count=0;
t1.setText("0");
t2.setText("");
}
else if(s.equals("."))
{
dota++;
if(dota==1)
{
if((t2.getText().equals(""))&&(t1.getText().equals("0")))
t1.setText(t1.getText()+s);
else if((t1.getText().equals(""+r))&&(t2.getText().equals(r+s1)))
t1.setText("0"+s);
else if((t2.getText().equals(""))&&(!t1.getText().equals("")))
t1.setText(t1.getText()+s);
else if((!t2.getText().equals(""))&&(!t1.getText().equals("")))
t1.setText(t1.getText()+s);
else
t1.setText("0"+s);
}
}
else
{
if((t1.getText().equals("0"))&&(t2.getText().equals("")))
t1.setText(s);
else if((t2.getText().indexOf("+")!=-1)||(t2.getText().indexOf("-")!=-1)||(t2.getText().indexOf("*")!=-1)||(t2.getText().indexOf("/")!=-1))
{
if(t1.getText().equals((""+r)))
t1.setText(s);
else
t1.setText(t1.getText()+s);
h=Integer.parseInt(t1.getText());
}
else if(s2.equals("="))
{
t1.setText(s);
s2="pop";
}
else
{
t1.setText(t1.getText()+s);
}
}
}
}
public void bckspc()
{
String str2 = t1.getText();
int l = str2.length();
if(l>0)
{
str2=str2.substring(0,l-1);
t1.setText(str2);
}
}
}

/*<applet code="calculator.class" width=500 height=500>
</applet>*/