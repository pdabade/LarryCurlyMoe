package example;

public class Shovel {

	public static synchronized void useShovel(String name) throws InterruptedException
	{
		System.out.println(name+" using the shovel...");
		//Thread.sleep(100);
	}
}
