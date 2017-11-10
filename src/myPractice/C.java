package myPractice;

public class C extends Thread{
	public void run()
	{
		for(int k = 1; k <= 500; k++)
		{
			System.out.println("\t From Thread C: k = "+k);
		}
		System.out.println("Exit from C");
	}

}
