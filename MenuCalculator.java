package designingMenu;

import java.util.Scanner;

public class MenuCalculator {
private int num1,num2,option;
	public MenuCalculator(int num1,int num2) {
		// TODO Auto-generated constructor stub
		this.num1=num1;
		this.num2=num2;
		
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int add()
	{
		return num1+num2;
	}
	public int subtract()
	{
		return num1-num2;
	}
	public int multiply()
	{
		return num1*num2;
	}
	public int division()
	{
		return num1/num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int option,num1 ,num2;
		 //prompting the user
		 System.out.println("Enter first number :");
		Scanner scanner = new Scanner(System.in);
		 num1 = scanner.nextInt();
		 System.out.println("Enter second number :");
		 num2 = scanner.nextInt(); 
		 System.out.println("1: Add\n2: Multiply\n3: Subtract\n4: Divide\n"
		 		+ "choose operator :");
		 option = scanner.nextInt();
		 //declaring an object
		 MenuCalculator calcObj = new MenuCalculator(num1,num2);
		 //getting result based on the chosen operator
	/*	 if(option ==1)
		 {
			System.out.println("Result is :"+ calcObj.add());
		 }
		 else
			 if(option ==2)
			 {
				System.out.println("Result is :"+ calcObj.multiply());
			 }
			 else
				 if(option ==3)
				 {
					System.out.println("Result is :"+ calcObj.subtract());
				 }
				 else
					 if(option ==4)
					 {
						System.out.println("Result is :"+ calcObj.division());
					 }
					 */
				 
		switch(option)
		{
		case 1:System.out.println("Result is :"+ calcObj.add());break;
		case 2:System.out.println("Result is :"+ calcObj.multiply());break;
		case 3: System.out.println("Result is :"+ calcObj.subtract());break;
		case 4: System.out.println("Result is :"+ calcObj.division());break;
			
		}

	}

}
