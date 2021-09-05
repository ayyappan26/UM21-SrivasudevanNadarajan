package um21.activity2;

public class LibraryInterfaceDemo {

	public static void main(String[] args) 
	{
		KidsUsers kid=new KidsUsers();
		AdultUsers adult=new AdultUsers();
		kid.registerAccount(10);
		kid.registerAccount(18);
		kid.requestBook("kids");
		kid.requestBook("Fiction");
		adult.registerAccount(5);
		adult.registerAccount(23);
		adult.requestBook("kids");
		adult.requestBook("Fiction");
		

	}

}
