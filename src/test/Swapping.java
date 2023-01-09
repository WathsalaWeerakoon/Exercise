package test;
public class Swapping {
	
	public static void main (String args[])
	{
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("The numbers before swap");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp = num1;
		num1 = num2;
		num2= temp;
		
		System.out.println("The numbers after swap");
		System.out.println(num1);
		System.out.print(num2);
			
	}

}
