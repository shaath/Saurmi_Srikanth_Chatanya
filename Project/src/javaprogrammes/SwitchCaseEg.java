package javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		String course="selenium";

		switch (course) 
		{
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "Uft":
			System.out.println("You are seelcted Uft");
			break;
		case "LoadRunner":
			System.out.println("You are selected LoadRunner");
			break;
		default:
			System.out.println("Selecte a proper keyword");
			break;
		}
	}

}
