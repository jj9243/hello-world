package myPractice;

public class A extends Thread {
	public void run()
	{
		for(int i = 1; i <= 500 ; i++)
		{
			System.out.println("\t From Thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}

}
