import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest2lab7 {

	public static void main(String[] args) {
		/*214673
		 * NURUL SAIDAHTUL FATIHA BINTI SHAHARUDIN
		 * SOFTWARE ENGINEERING
		 * PROBLEM SOLVING AND PROGRAMMING
		 * QUEST 2 LAB 7 
		 */
		DecimalFormat df= new DecimalFormat("0.00");
		Scanner input=new Scanner(System.in);
		char choice='y';
		
		while(choice=='y') {
			int Eggs=1,A=0,B=0,C=0,D=0;
			double totalWeights=0, TotalWeightA=0,TotalWeightB=0,TotalWeightC=0,TotalWeightD=0;
			
		
		do {
			System.out.print("Enter the weight of egg in gram : ");
			double WeightEgg=input.nextDouble();
			totalWeights=totalWeights+WeightEgg;
			
			char GetGrade= GetGrade( WeightEgg, A, B,  C,  D, TotalWeightA, TotalWeightB, TotalWeightC, TotalWeightD);
			
			switch(GetGrade) {
				case 'A':
					TotalWeightA=TotalWeightA+WeightEgg;
					A=A+1;
					break;
				case'B':
					TotalWeightB=TotalWeightB+WeightEgg;
					B=B+1;
					break;
				case'C':
					TotalWeightC=TotalWeightC+WeightEgg;
					C=C+1;
					break;
				case'D':
					TotalWeightD=TotalWeightD+WeightEgg;
					D=D+1;
					break;
				default:
					break;
			
			}
			
		
		
			
		Eggs=Eggs+1;
		
		}while(Eggs<=10);
		countGrade(A,B,C,D);
		GradeWeight(TotalWeightA,TotalWeightB,TotalWeightC,TotalWeightD,A,B,C,D);
		Report( TotalWeightA, TotalWeightB,  TotalWeightC, TotalWeightD , A,  B, C,  D);
		
		System.out.println("\nThe Total Weight All Eggs is "+ (TotalWeightA+TotalWeightB+TotalWeightC+TotalWeightD+"g"));
		System.out.println("\nDo you wish to continue?(y/n)");
		
		
		choice=input.next().charAt(0);
			
	}
		System.out.println("THANK YOU");
	}
			public static char GetGrade(double WeightEgg,int A,int B, int C, int D,double TotalWeightA,double TotalWeightB,double TotalWeightC,double TotalWeightD) {
				char GetGrade=' ';
			
			if (WeightEgg>44) {
				System.out.println("Grade=A");
					GetGrade='A';
				}
			else if (WeightEgg>=30 &&WeightEgg<=44) {
				System.out.println("Grade=B");
				GetGrade='B';
			}
			
			else if (WeightEgg>=25&&WeightEgg<=29) {
				
				System.out.println("Grade=C");
				GetGrade='C';
			}
			else if(WeightEgg<25) {
				System.out.println("Grade=D (Rejected)");
				GetGrade='D';
			
				
			
			}
			return GetGrade;
				
				
			}
		public static void countGrade(int A,int B,int C,int D) {
			
		A=A;
		B=B;
		C=C;
		D=D;
			
			 
			
			
			}
		public static void GradeWeight(double TotalWeightA,double TotalWeightB, double TotalWeightC,double TotalWeightD ,int A, int B,int C, int D ) {
			DecimalFormat df= new DecimalFormat("0.00");
	
			double AverageWeightA=TotalWeightA/A;
			double AverageWeightB=TotalWeightA/A;
			double AverageWeightC=TotalWeightA/A;
			double AverageWeightD=TotalWeightA/A;
	}
		public static void Report(double TotalWeightA,double TotalWeightB, double TotalWeightC,double TotalWeightD ,int A, int B,int C, int D){
			DecimalFormat df= new DecimalFormat("0.00");
			System.out.println("\nThe Amount of Grade A is "+A
					+"\nThe amount of grade B is " +B 
					+"\nThe amount of grade C is "	+C
					+"\nThe amount of  grade D is "+D);
			System.out.println(" ");
			System.out.println("\nThe Total Weight of Grade A is "+ TotalWeightA +", Average Weight Grade A : "+df.format(TotalWeightA/A)
			+"\nThe Total Weight of grade B is " +TotalWeightB +", Average Weight Grade B : "+df.format(TotalWeightB/B)
			+"\nThe Total Weight of grade C is "	+TotalWeightC+", Average Weight Grade C : "+df.format(TotalWeightC/C)
			+"\nThe Total Weight of  grade D is "+(TotalWeightD)+", Average Weight Grade A : "+df.format(TotalWeightD/D));
		}
}
