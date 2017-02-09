package methods;

public class BasicMethodsg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsg b=new BasicMethodsg();
		b.function3();
		
		boolean flag=b.function4();
		System.out.println(flag);
	}
	
	//static Method without retrurning any value
	

	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static method with retrurning value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Non static method without returning any value
	
	public void function3()
	{
		System.out.println("This is function3 code");
		
	}
	
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
}
