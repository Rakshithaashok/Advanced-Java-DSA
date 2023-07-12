package Myprojects;

public class SumOfLastDigits {
	public static void main(String[] args)
	{
		System.out.println(addLastDigits(267,154));
	}
	public static int addLastDigits(int input1, int input2)
	{
		input1 = Math.abs(input1);
		input2 = Math.abs(input2);
		int l1 = input1%10;
		int l2 = input2%10;
		return l1+l2;
	}
}
