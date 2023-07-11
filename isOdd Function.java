package Myprojects;

public class Odd {
	public static void main(String[]args)
	{
		System.out.println(isOdd(9));
	}
	public static int isOdd(int a)
	{
		if(a%2!=0)
		{
			return 2;
		}
		return 1;
	}
}
