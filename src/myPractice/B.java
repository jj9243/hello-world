package myPractice;

public class B extends Thread {
	public void run()
	{
		for(int j = 1; j<= 500; j++)
		{
			System.out.println("\t From Thread B: j = " +j);
		}
		System.out.println("Exit from B");
	}

}
