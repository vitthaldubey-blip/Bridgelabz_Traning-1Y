import java.util.Scanner;
class profit{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the cp");
		int cp=sc.nextInt();
		System.out.println("enter the sp");
		int sp=sc.nextInt();
		int p=sp-cp;
		int q=p*100/100;
		System.out.println("profit"+ p);
		System.out.println("profit %"+ q);
		
	}
}	