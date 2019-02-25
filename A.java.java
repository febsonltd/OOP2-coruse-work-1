import java.util.Scanner;

public class s{

	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);

		System.out.println("enter java2");
		Double num1=Scn.nextDouble();
		System.out.println("enter computer application");
		Double num2=Scn.nextDouble();
		System.out.println("enter operating system");
		Double num3=Scn.nextDouble();
		System.out.println("enter calculus");
		Double num4=Scn.nextDouble();
		System.out.println("enter web design2");
		Double num5=Scn.nextDouble();
		System.out.println("enter computer networks");
		Double num6=Scn.nextDouble();
		System.out.println("enter communication skills");
		Double num7=Scn.nextDouble();
		Double sum;
		sum=num1+num2+num3+num4+num5+num6+num7;
		System.out.println("sum ="+ sum);
		Double avg;
		avg=sum/7;
		System.out.println("avg ="+ avg);
		
		if(avg>=90 && avg<100)
		{
			System.out.println("GPA="+5.0);
		}
		else if(avg>=80 && avg<90)
		{
			System.out.println("GPA="+4.0);
		}
		else if(avg>=70 && avg<80)
		{
			System.out.println("GPA="+3.0);
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("GPA="+2.0);
		}
		else {
			System.out.println("fail");
		}
		
	}

}
