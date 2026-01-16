import java.util.Scanner;
class profit{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the m of phy");
		int P=sc.nextInt();
		System.out.println("enter the m of maths");
		int C=sc.nextInt();
		System.out.println("enter the m of che");
		int M=sc.nextInt();
		
		double A=P+C+M/3;
		
		System.out.println("madan ki ma ki chut kitni bar??"+ A);
	}
}		
		