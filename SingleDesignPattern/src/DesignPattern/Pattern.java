package DesignPattern;

public class Pattern {

	public static void main(String[] args)
	{
		Singleton obj = Singleton.getSingletInstance();
		Singleton obj1 = Singleton.getSingletInstance();
		
	}

}
class Singleton
{
	public static Singleton obj;
	String s;
	private Singleton()
	{
		System.out.println("Hello world");
	}
	public static Singleton getSingletInstance()
	{
		if(obj == null)
		{
			obj = new Singleton();
		}
		return obj;
	}
}

