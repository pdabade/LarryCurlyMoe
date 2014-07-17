package example;

public class Holes {

	boolean[] hole_avail;
	boolean[] seed_avail;
	static int dist=0;

	Holes(int m)
	{
		hole_avail = new boolean[m];
		seed_avail = new boolean[m];
		for(int i=0;i<m;i++)
		{
			hole_avail[i]=false;
			seed_avail[i]=false;
		}
	}

	synchronized void dig(int num)
	{
		try {
			while(dist>=4)
			{
				wait();
			}

			Shovel.useShovel("Larry");
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hole_avail[num]=true;
		dist++;

		int k = num+1;

		System.out.println("Larry dug hole #"+k+"\n");
		//System.out.println("Dist #"+dist);


	}

	synchronized void plant(int num)
	{
		while(hole_avail[num]==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		int k = num+1;
		seed_avail[num]=true;

		System.out.println("Moe planted in hole #"+k+"\n");

	}
	
	synchronized void cover(int num)
	{
		try {
			while(seed_avail[num]==false)
			{
				wait();
			}

			Shovel.useShovel("Curly");
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dist--;
		int k = num+1;
		System.out.println("Curly covered hole #"+k+"\n");
		//System.out.println("Dist #"+dist);
	}

}
