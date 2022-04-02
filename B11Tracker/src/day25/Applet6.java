package day25;

import java.applet.Applet;
import java.awt.*;

public class Applet6 extends Applet {
	Panel1 p1;
	Panel2 p2;
	
	public void init()
	{
		setLayout(new GridLayout(1,2));
		add(p1 = new Panel1());
		add(p2 = new Panel2());
		//p1.c1.getstate
		
	}
}
class Panel1 extends Panel
{
	Checkbox c1,c2,c3;
	CheckboxGroup g1;
	public Panel1()
	{
		g1 = new CheckboxGroup();
		setLayout(new GridLayout(3,1));
		add(c1 = new Checkbox("Tour1",g1,true));
		add(c2 = new Checkbox("Tour2",g1,false));
		add(c3 = new Checkbox("Tour3",g1,false));
	}
}
class Panel2 extends Panel
{
	Checkbox c1,c2,c3;
	TextField t;
	public Panel2()
	{
		setLayout(new GridLayout(4,1));
		add(c1 = new Checkbox("Manali"));
		add(c2 = new Checkbox("Shimla"));
		add(c3 = new Checkbox("Dalhousie"));
	}
}
