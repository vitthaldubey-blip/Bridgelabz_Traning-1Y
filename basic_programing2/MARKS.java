import java.util.Scanner;
class MARKS
{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter pens");
		int a=sc.nextInt();
		System.out.println("enter students");
		int b=sc.nextInt();
		double d=(a/b);
		System.out.println("distribution pen :- " +d);
		double e=(a%b);
		System.out.println("remainder:- " +e);
		
		}
}