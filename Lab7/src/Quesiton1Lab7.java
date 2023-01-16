

import java.text.DecimalFormat;

import java.util.Scanner;

public class Quesiton1Lab7 {
/*214673
 * NURUL SAIDAHTUL FATIHA BINTI SHAHARUDIN
 * SOFTWARE ENGINEERING
 * PROBLEM SOLVING AND PROGRAMMING
 * QUEST 1 LAB 7 
 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char Decision;

		do {
			
			
			Decision='y';
			double Age=getAge();
			double Weight=getWeight();
			double Height=getHeight();
			char Gender=getGender();
			
			double Bmi= calcBMI(Height,Weight);
			double Bmr= calcBMR(Height,Weight,Gender,Age);
		
			if(choice()=='1')
				displayBmi( Weight,  Height,  Bmi);
			
			else if(choice()=='2')
				displayBmr( Weight,  Height,  Bmr , Gender, Age);
			else
				System.out.println("ERROR");
			
			
			System.out.println("\nDo you want to continue?(y/n):");
			 Decision=input.next().charAt(0);
			
			
		}while(Decision !='n');
		System.out.println("***************************************************");
	}
			
			public static double getAge() {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter age:");
				double Age= input.nextDouble();
				return Age;
			}
			public static double getWeight() {
				Scanner input= new Scanner(System.in);
				System.out.print("Enter weight(kg):");
				double Weight=input.nextDouble();
				return Weight;
			}
			
			public static double getHeight() {
				Scanner input= new Scanner(System.in);
				System.out.print("Enter height(cm):");
				double Height=input.nextDouble();
				return Height;
			}
			public static char getGender() {
				Scanner input= new Scanner(System.in);
				System.out.print("Enter gender(f/m):");
				char Gender=input.next().charAt(0);
				return Gender;
			}
			
			public static double calcBMI(double Height,double Weight) {
				Height=Height/100;
				double Bmi= Weight/(Height*Height);
				return Bmi;
			}
			
			public static double calcBMR(double Height,double Weight,char Gender,double Age) {
				double Bmr = 0;
				double BmrWomen=0;
				double BmrMen=0;
				
				if (Gender=='f') {
					  BmrWomen = 655+(9.6*Weight)+(1.8*Height)-(4.7*Age);
				Bmr=BmrWomen;}
				
				else if(Gender=='m') {
					 BmrMen=(66)+(6.23*Weight)+(1.8*Height)-(6.8*Age);
				Bmr=BmrMen;}
				
				else
					System.out.println("Error");
				return Bmr;
				
			}
			public static void displayBmi(double Weight, double Height, double Bmi) {
				DecimalFormat df= new DecimalFormat("0.00");
				System.out.print("The Bmi for weight "+Weight+" and Height "+Height+" is "+ df.format(Bmi));
				
				
				
			}
			public static void displayBmr(double Weight, double Height, double Bmr ,char Gender,double Age) {			
				DecimalFormat df= new DecimalFormat("0.00");
				System.out.print("The Bmr for age "+Age+" is "+ df.format(Bmr));
			
					
				}
			public static char choice () {
				char choice;
				Scanner input=new Scanner(System.in);
				
				System.out.print("Enter Choice (1-BMI,2-BMR) :");
				 choice= input.next().charAt(0);
				 return choice;
			}
			
			}
			
			


