import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest3Lab7 {

	public static void main(String[] args) {
		/*214673
		 * NURUL SAIDAHTUL FATIHA BINTI SHAHARUDIN
		 * SOFTWARE ENGINEERING
		 * PROBLEM SOLVING AND PROGRAMMING
		 * QUEST 3 LAB 7 
		 */
		DecimalFormat df=new DecimalFormat("0.00");
		Scanner input=new Scanner(System.in);
		int i=1; int A=1;
		double AllQuizMarks=0,AllAssignmentMarks=0,TotalMarks=0;
		char Choice='Y';
		
		
		while(Choice=='Y') {
		System.out.println("Enter your name: ");
		String Name=input.next();
		Name=Name+input.nextLine();
		
		
		
		do {
			double QuizMark=quiz(i);
			AllQuizMarks=AllQuizMarks+QuizMark;
			 
			i=i+1;
		}while(i<=3);
		i=3;
		double CalculateQuizAverage=CalculateQuizAverage(AllQuizMarks,i);
		
		
		do {
			double MarksAssignment=MarksAssignment(A);
			AllAssignmentMarks=AllAssignmentMarks+MarksAssignment;
			
			A=A+1;
		}while (A<=2);
		A=2;
		double CalculateAssignmentAverage=CalculateAssignmentAverage(AllAssignmentMarks);
		double CalculateMidTermMark=CalculateMidTermMark();
		double CalculateFinalMark=CalculateFinalMark();
		
		TotalMarks=CalculateQuizAverage+CalculateAssignmentAverage+CalculateMidTermMark+CalculateFinalMark;
		
		System.out.println("Total Marks= "+df.format(TotalMarks));
		 
		Grade(Name, TotalMarks);
		
		System.out.print("More grade computation?(y/n): ");
		Choice=input.next().charAt(0);
		}
		System.out.println("Thank you ");
		
//14.5995 25 24.25 39.2 
	}
	
	//METHOD STARTS HERE
	
	
		public static double quiz(int i) {
			
		
			Scanner input=new Scanner(System.in);
		System.out.print("Enter mark for quiz "+ i +": ");	
		double QuizMark=input.nextDouble();
		return QuizMark;
			
		}
		
			
		
		public static double CalculateQuizAverage(double AllQuizMarks,int i) {
			DecimalFormat df=new DecimalFormat("0.00");
			double CalculateQuizAverage= AllQuizMarks/ i;
			
			System.out.println("The Average for the Quiz is :"+ CalculateQuizAverage);
			CalculateQuizAverage=((CalculateQuizAverage/100)*15);
			return CalculateQuizAverage;
		}
		
		public static double MarksAssignment(int A) {
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the Mark for Assignment "+A+" :");
			double MarkAssignment=input.nextDouble();
			return MarkAssignment;
		}
		
		public static double CalculateAssignmentAverage(double AllAssignmentMarks) {
			DecimalFormat df=new DecimalFormat("0.00");
			double CalculateAssignmentAverage=AllAssignmentMarks/2;
			System.out.println("The Average for All Assignments is "+ CalculateAssignmentAverage);
			CalculateAssignmentAverage=(CalculateAssignmentAverage/100)*25;
			return CalculateAssignmentAverage;
		}
		public static double CalculateMidTermMark() {
			Scanner input=new Scanner(System.in);
			DecimalFormat df=new DecimalFormat("0.00");
			System.out.print("Enter the Mid-Term Exam mark : ");
			 double CalculateMidTermMark=input.nextDouble();
			 CalculateMidTermMark=(((CalculateMidTermMark/100)*(50))/50)*20;
			 return CalculateMidTermMark;
		}
		public static double CalculateFinalMark() {
			Scanner input=new Scanner(System.in);
			DecimalFormat df=new DecimalFormat("0.00");
			System.out.print("Enter the Final Exam mark : ");
			 double CalculateFinalMark=input.nextDouble();
			 CalculateFinalMark=(((CalculateFinalMark/100)*(80))/80)*40;
			 return CalculateFinalMark;
		}
		
		public static void Grade(String Name,double TotalMarks) {
			
			if (TotalMarks>=80&&TotalMarks<=100) {
				System.out.println(Name+" ,Your final mark for CSC3100 is "+TotalMarks+" and Grade=A");}
			
			else if(TotalMarks>=70 &&TotalMarks<=79){
			System.out.println(Name+" ,Your final mark for CSC3100 is "+TotalMarks+" and Grade=B");}
			
			else if (TotalMarks>=55 &&TotalMarks<=69){
			System.out.println(Name+" ,Your final mark for CSC3100 is "+TotalMarks+" and Grade=C");}
			
			else if (TotalMarks<=45 &&TotalMarks<=54){
			 System.out.println(Name+" ,Your final mark for CSC3100 is "+TotalMarks+" and Grade=D");}
			 
			 else if (TotalMarks<45) {
			 System.out.println(Name+" ,Your final mark for CSC3100 is "+TotalMarks+" and Grade=E");}
			 
			 else
				 System.out.println("ERROR");
			
		}
}
