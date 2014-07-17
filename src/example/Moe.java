package example;

public class Moe implements Runnable{

	Thread t;
	Holes h;
	int MAX;

	Moe(Holes h,int n)
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
			h.plant(i);
		}
		System.out.println("Moe done!");
	}

}
