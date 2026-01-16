import java.util.Scanner;
class student{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of pen");
		int a=sc.nextInt();
		
		System.out.println("enter the no of student");
		int b=sc.nextInt();
		
		int c=a/b;
		int d=a%b;
		System.out.println("remender will be"+ c);
		System.out.println("qu will be"+ d);
	}
}	
		