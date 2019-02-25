import java.util.Scanner;

public class A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner result= new Scanner(System.in);
		double OOP,COMPUTERNETWORKS,WEBDESING,SYSTEMANALYSIS,BASICSTATISTIC,ENT,RESEARCHMETHODS,OPERATINGSYSTEMS,TOTAL,AVERAGE;
		System.out.println("Enter your OOP marks" +"");
		OOP=result.nextDouble();
		while(OOP<0||OOP>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     OOP = result.nextInt();
		}
		System.out.println("Enter your COMPUTERNETWORKS marks" +"");
		COMPUTERNETWORKS=result.nextDouble();
		while(COMPUTERNETWORKS<0||COMPUTERNETWORKS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		    COMPUTERNETWORKS = result.nextInt();
		}
		System.out.println("Enter your WEBDESING marks" +"");
		WEBDESING=result.nextDouble();
		while(WEBDESING<0||WEBDESING>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     WEBDESING = result.nextInt();
		}
		System.out.println("Enter your SYSTEMANALYSIS marks" +"");
		SYSTEMANALYSIS=result.nextDouble();
		while(SYSTEMANALYSIS<0||SYSTEMANALYSIS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     SYSTEMANALYSIS= result.nextInt();
		}
		
		System.out.println("Enter your BASICSTATISTIC marks" +"");
		BASICSTATISTIC=result.nextDouble();
		while(BASICSTATISTIC<0||BASICSTATISTIC>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     BASICSTATISTIC = result.nextInt();
		}
		System.out.println("Enter your ENT marks" +"");
		ENT=result.nextDouble();
		while(ENT<0||ENT>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     ENT = result.nextInt();
		}
		System.out.println("Enter your RESEARCHMETHODS marks" +"");
		RESEARCHMETHODS=result.nextDouble();
		while(RESEARCHMETHODS<0||RESEARCHMETHODS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		    RESEARCHMETHODS = result.nextInt();
		}
		System.out.println("Enter your OPERATINGSYSTEMS marks" +"");
		OPERATINGSYSTEMS=result.nextDouble();
		while(OPERATINGSYSTEMS<0||OPERATINGSYSTEMS>100){
		     System.out.println("You Entered the wrong number , Enter The number Again :");
		     OPERATINGSYSTEMS = result.nextInt();
		}
		TOTAL=OOP+COMPUTERNETWORKS+WEBDESING+SYSTEMANALYSIS+BASICSTATISTIC+ENT+RESEARCHMETHODS+OPERATING SYSTEMS;
		System.out.println("Total="+ TOTAL);
		AVERAGE=TOTAL/8;
		System.out.println("AVERAGE="+ AVERAGE);
		
	
		if(AVERAGE>=80 && AVERAGE<100) {
			System.out.println("GPA=" +5.0);
		} else if(AVERAGE>=85 && AVERAGE<80) {
			System.out.println("GPA="+4.5);
			
		} 
		 else if(AVERAGE>100) {
				System.out.println("GPA=" +"INVALID INPUT");
				}
		 else if(AVERAGE>=70 && AVERAGE<75) {
			System.out.println("GPA="+4.0);
		}else if(AVERAGE>65 && AVERAGE<70) {
			System.out.println("GPA="+3.5);}
		else if(AVERAGE>=60 && AVERAGE<65) {
			System.out.println("GPA="+3.0);
		}else if(AVERAGE>=55 && AVERAGE<60) {
			System.out.println("GPA="+2.5);
		}else if(AVERAGE>=50 && AVERAGE<55) {
			System.out.println("GPA="+2.0);
		}else if(AVERAGE>=45 && AVERAGE<50) {
			System.out.println("GPA="+1.5);
		}else if(AVERAGE>=40 && AVERAGE<45) {
			System.out.println("GPA="+1.0);
		}
			else if(AVERAGE>=35 && AVERAGE<40) {
				System.out.println("GPA="+0.5);
			}else if(AVERAGE>=30 && AVERAGE<35) {
				System.out.println("GPA="+0.4);
			}else if(AVERAGE>=25 && AVERAGE<30) {
				System.out.println("GPA="+0.3);
			}else if(AVERAGE>=20 && AVERAGE<25) {
				System.out.println("GPA="+0.2);
			}else if(AVERAGE>=1 && AVERAGE<20) {
				System.out.println("GPA="+0.1);
			}
		else{
			System.out.println("GPA="+0.0);
		}
			
		}
}
	
		
		
		

	


