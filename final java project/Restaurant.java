import java.util.*;

class Restaurant extends Helper
{	
	public String name;
	private String loginId;
	private String password;
	private ArrayList<String>menu = new ArrayList<String>();
	private ArrayList<Integer>rates = new ArrayList<Integer>();


	public void signUp()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the name of your Restaurant : ");
		String name=sc.nextLine();
		setName(name);

		System.out.println("Please enter loginId : ");
		String loginId = sc.nextLine();
		setLoginId(loginId);

		System.out.println("Please enter the Password : ");
		String password = sc.nextLine();
		setPassword(password);

		System.out.println("Please enter the name of dishes and corresponding rate : ");
		char cont='y';
		ArrayList<String>menu = new ArrayList<String>();
		ArrayList<Integer>rates = new ArrayList<Integer>();
		while(cont=='y')
		{
			System.out.print("Dish name : ");
			String dishName=sc.nextLine();
			menu.add(dishName);
			System.out.print("Rate : ");
			int rate = sc.nextInt();
			rates.add(rate);
			System.out.print("Continue ? (y/n): ");
			cont=sc.next().charAt(0);
			sc.nextLine();
		}
		setMenu(menu);
		setRate(rates);
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setMenu(ArrayList<String> menu)
	{
		for(String i : menu)
		{
			this.menu.add(i);
		}
	}
	public void setRate(ArrayList<Integer> rates)
	{
		for(Integer i:rates)
		{
			this.rates.add(i);
		}
	}

	public int getRate(int i)
	{
		return rates.get(i-1);
	}
	public void procede()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome !");
		System.out.println("Your menu is as follows : ");
		displayMenu();
		System.out.print("Do you want to make any changes ?(y/n) ");
		char cont = sc.next().charAt(0);
		if(cont=='y')
		{
			updateInfo();
		}
	}


	public boolean validation(String inputLoginId,String inputPassword)
	{
		return checking(this.loginId,this.password,inputLoginId,inputPassword);
	}


	public void updateInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to update ?");
		System.out.println("1. Name of your Restaurant");
		System.out.println("2. LoginID");
		System.out.println("3. Password");
		System.out.println("4. Menu");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1:
				System.out.println("Please enter the name of your Restaurant : ");
				name=sc.nextLine();
				break;
			case 2:
				System.out.println("Please enter loginId : ");
				loginId = sc.nextLine();
				break;
			case 3:
				System.out.println("Please enter the Password : ");
				password = sc.nextLine();
				break;
			case 4:
				System.out.println("Please enter the name of dishes and corresponding rate : ");
				char cont='y';
				
				while(cont=='y')
				{
					System.out.print("Dish name : ");
					String dishName=sc.nextLine();
					menu.add(dishName);
					System.out.print("Rate : ");
					int rate = sc.nextInt();
					rates.add(rate);
					System.out.print("Continue ? (y/n): ");
					cont=sc.next().charAt(0);
					sc.nextLine();
				}
				break;		
		}
	}

	public void displayMenu()
	{
		int listOfDishes=menu.size();
		System.out.println("Dishes\t\t\tRates\n");
		for(int i=0; i<listOfDishes; i++)
		{
			System.out.println(menu.get(i)+"\t\t\t"+rates.get(i));
		}
	}
}







