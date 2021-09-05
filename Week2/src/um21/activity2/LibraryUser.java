package um21.activity2;
 interface LibraryUser
{
	
	
		registerAccount();
		requestBook();
	}
	class KidsUsers implements LibraryUser
	{
		int age;
		String bookType;
	public void registerAccount(int age)
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType)
	{
		if(bookType=="Kids")
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}}
	class AdultUsers implements LibraryUser
	{
		int age;
		String bookType;
	public void registerAccount(int age)
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under a Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType)
	{
		if(bookType=="Fiction")
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only Fiction books");
		}
	}}



