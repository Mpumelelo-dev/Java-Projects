package myChar.com;
//Mpumelelo Ngozo
public class MyChar {
	private char ch;
	
	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public MyChar(char ch)
	{
		this.ch = ch;	}
	
	public boolean isVowel()
	{
		
		if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' )
			return true;
		else
			return false;
			
	}
	public boolean isConsonant()
	{
		if (this.isVowel()==false && this.isDigit()==false)
		{
			return true;
			
		}
		else
			return false;
	}
	public boolean isDigit() {
	
		if(ch>=48 && ch<=57) //using integer rep
		
			return true;
		
		else
			return false;
	}
	public boolean isAlphabet()
	{
		if(ch>=97 &&ch<=122)
		{
			return true;
		}
		else
			if(ch>=65 &&ch<=90)
			{
				return true;
			}
			
			return false;
	}
	public void printUpperAlph()
	{
		for(int i = 65;i<91;i++)
		{
			System.out.print((char)i+" ");
		}
	}
	
	public void printLowerAlph()
	{
		for(int i = 97;i<123;i++)
		{
			
			System.out.print((char)i+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyChar ch = new MyChar('Z');
System.out.println(ch.isVowel());
System.out.println(ch.isConsonant());
System.out.println(ch.isDigit());
System.out.println(ch.isAlphabet());
ch.printLowerAlph();
System.out.println();
ch.printUpperAlph();

	}

}

