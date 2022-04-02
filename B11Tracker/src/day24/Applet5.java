package day24;

import java.applet.Applet;
import java.awt.*;


public class Applet5 extends Applet{
	Checkbox c1,c2,c3,c4;
	TextField t;
	public void init() {
		CheckboxGroup fg= new CheckboxGroup();
		setLayout(new GridLayout(5,1));
		
		add(c1= new Checkbox("1"));
		add(c1= new Checkbox("11",fg, false));
		add(c2= new Checkbox("2"));
		add(c1= new Checkbox("22",fg, false));
		add(c3= new Checkbox("3"));
		add(c1= new Checkbox("33",fg, false));
		add(c4= new Checkbox("4"));
		add(c1= new Checkbox("44",fg, false));
		add(t = new TextField(15));
		
	}
	
	public boolean action()
	{
		return false;
	}

}
