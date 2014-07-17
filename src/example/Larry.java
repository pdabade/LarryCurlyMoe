package example;

public class Larry implements Runnable{

	Thread t;
	Holes h;
	int MAX;

	Larry(Holes h,int MAX)
	{
		t = new Thread(this);
		this.h = h;
		this.MAX = MAX;
		t.start();
		
	}
	
	public void run() {	
		for(int i=0;i<MAX;i++)
		{
			h.dig(i);
		}
		System.out.println("Larry done!");
	}

}
