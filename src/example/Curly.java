package example;

public class Curly implements Runnable{

	Thread t;
	Holes h;
	int MAX;

	Curly(Holes h,int n)
	{
		t = new Thread(this);
		this.h = h;
		MAX = n;
		t.start();
		
	}
	@Override
	public void run() {	
		for(int i=0;i<MAX;i++)
		{
			h.cover(i);
		}
		System.out.println("Curly done!");
	}

}
