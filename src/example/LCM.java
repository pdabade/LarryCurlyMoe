package example;

public class LCM {

	private static int MAX_HOLES;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MAX_HOLES = 10;
	
		Holes h = new Holes(MAX_HOLES);
		
		Curly c = new Curly(h,MAX_HOLES);
		Moe m = new Moe(h,MAX_HOLES);
		Larry l = new Larry(h,MAX_HOLES);	

	}

}
