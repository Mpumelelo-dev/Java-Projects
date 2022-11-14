package squaresAndcubes;

import java.util.Scanner;

public class WhilenumberPlayer {
private int limit;
	public int getLimit() {
	return limit;
}
public void setLimit(int limit) {
	this.limit = limit;
}
	public WhilenumberPlayer(int limit) {
	// TODO Auto-generated constructor stub
		this.limit=limit;
	}
	public void printSquareUptoLimit()
	{
		int count=1;
		double square=0;
		
		while( (Math.pow(count,2)) < limit )
		{
			
			for(int i = count;i<=count;i++)
			{
				square=Math.pow(count,2);
				System.out.print((int)square + " ");
			}
			count ++;
		}
	}
	public void printCubeUptoLimit()
	{
		int count=1;
		double cube=0;
		System.out.println();
		while( (Math.pow(count,3)) < limit )
		{
			
			for(int i = count;i<=count;i++)
			{
				cube=Math.pow(count,2);
				
				System.out.print((int)cube + " ");
			}
			count ++;
		}
	}
//DO WHILE EXERCISE
	public void cube()
	{
		int num=-1;
	do
	{
		if(num >=0)
		{
		double cube = Math.pow(num, 3);
		
		System.out.println("Cube is :" + (int)cube);
		}
		//prompt user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number :");
	num=scanner.nextInt();
	
		
		
	
	}while(num>=0);
	System.out.println("Thank you!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhilenumberPlayer obj =new WhilenumberPlayer(30);
		obj.printSquareUptoLimit();
		obj.printCubeUptoLimit();
		obj.cube();
	}

}
