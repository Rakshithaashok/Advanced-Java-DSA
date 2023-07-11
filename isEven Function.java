package Myprojects;

public class Even {
	public static void main(String[] args)
    {
      System.out.println(isEven(6));
    }
    public static int isEven(int a)
    {
        if(a%2==0)
        {
            return 2;
        }
        return 1;
    }
}
