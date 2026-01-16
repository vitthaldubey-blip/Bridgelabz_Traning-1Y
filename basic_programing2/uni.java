import java.util.Scanner;
class uni{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the fees amount ");
		int f=sc.nextInt();
		System.out.println("enter discount");
		int d=sc.nextInt();
		double c=f*d/100;
		double q=f-c;
		System.out.println("total amount will  be"+ q);
		
	}
}	
		