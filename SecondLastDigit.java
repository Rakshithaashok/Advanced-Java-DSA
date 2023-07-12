package Myprojects;

public class SecondLastDigit {
	public static void main(String[] agrs)
	{
		System.out.println(Digit(197));
	}
	public static int Digit(int num)
	{
		int l = Math.abs(num);
		if(l/10 == 0)
		{
			return -1;
		}
		return (l%100)/10;
	}
	
}
