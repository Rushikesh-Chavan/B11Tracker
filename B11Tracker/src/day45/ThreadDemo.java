package day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo extends Frame implements Runnable {
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public ThreadDemo()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(this);
		th2=new Thread(this);
		th1.start();
		th2.start();
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			});
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ThreadDemo();
		 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Thread th=Thread.currentThread();
			if(th.equals(th1))
			{
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
			}
			if(th.equals(th2))
			{
				t2.setText(String.valueOf(j));
				if(j==100)
					j=0;
				else
					j++;				
			}
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				
			}
		}
	}

}
