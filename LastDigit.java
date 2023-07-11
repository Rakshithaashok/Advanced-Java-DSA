package Myprojects;

public class LastDigit {
	public static void main(String[] args)
	{
		System.out.println(lastDigit(-197));
	}
	public static int lastDigit(int num)
	{
		int l = Math.abs(num);
		return l%10;
	}
}
