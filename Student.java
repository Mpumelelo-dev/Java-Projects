package array;

import java.util.ArrayList;

class Student {
String name;
int[] marks;
	public Student(String name,int[] marks) {
		// TODO Auto-generated constructor stub
		this.marks= marks;
		this.name=name;
	}
	public int getNumofMarks()
	{
		return marks.length;		
	
	}
	public int getSum() {
		int sum=0;
		for(int i =0;i<marks.length;i++)
		{
			sum = sum+marks[i];
		}
		return sum;
	}
	public int getMax()
	{
		int max = 0;
		for(int i =0;i<marks.length;i++)
		{
		if(max<marks[i])
		{
			max=marks[i];
		}
		
		}
		return max;
	}
	public int getMin()
	{
		int min = marks[0];
		for(int i =0;i<marks.length;i++)
		{
		if(min>marks[i])
		{
			min=marks[i];
		}
		
		}
		return min;
	}
	public Double getAve()
	{
		
		return (double)getSum()/getNumofMarks();
		
	}
	public int[] addNewMark(int x)
	{
		int newmarks[] = new int[marks.length+1];
		for(int i =0;i<marks.length;i++)
		{
			newmarks[i]=marks[i];
		}
		newmarks[marks.length]=x;
		return newmarks;
	}
	public void removeMark(int index)
	{
		ArrayList<Integer> mark = new ArrayList<Integer>();
		for(int i :marks)
		{
			mark.add(i);
			//mark.remove(index);
			
		}
		mark.remove(index);
		for(int i : mark)
		{
			System.out.print(i+" ");
		}
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mpumelelo";
		int[] marks= {25,50,80,100};
Student myObj = new Student(name, marks);
//int number = myObj.getNumofMarks();
int sum =  myObj.getSum();
int max = myObj.getMax();
int min = myObj.getMin();
Double ave = myObj.getAve();
System.out.println("maximum :"+max);
System.out.println("Minimum :" +min);	
System.out.println("sum :"+sum);
System.out.println("Average :"+ave);
int[] newMarks = myObj.addNewMark(35);
System.out.print("New list : ");
for(int i =0;i<newMarks.length;i++)
{
	System.out.print( newMarks[i]+" ");
}
System.out.println();

System.out.print("Remove list : ");
myObj.removeMark(2);

}
	
	}
