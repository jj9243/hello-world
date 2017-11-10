package myPractice;

public class ThreadTest {
	public static void main(String args[])
	{
		String a = "31";
		String b = "1380";
		String c = "731";
		
		String a1 = "</>";
		String a2 = "<lim/>";
		
		if(a2.substring(0,1).equals("<") && a2.substring(a2.indexOf("/>"),a2.indexOf("/>") + 2).equals("/>")){
			System.out.println("True");
		}
		else
			System.out.println("False");
		
		
	}

}
