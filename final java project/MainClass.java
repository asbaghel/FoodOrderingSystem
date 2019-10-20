
import java.util.*;


class Main
{
	public static void predefined(ArrayList<Restaurant>listOfRestaurant,ArrayList<Customer>listOfCustomer)
	{
		Customer c1,c2;
		Restaurant r1,r2;
		
		c1 = new Customer();
		c2 = new Customer();

		c1.setLoginId("ajinkya");
		c1.setPassword("aji123");
		c1.setMailId("aji@123");
		c1.setAddress("xyz");
		c1.setPhoneNo("9234561371");

		c2.setLoginId("abhishek");
		c2.setPassword("abhi123");
		c2.setMailId("asbaghel");
		c2.setAddress("abc");
		c2.setPhoneNo("9234561332");

		listOfCustomer.add(c1);
		listOfCustomer.add(c2);



		r1 = new Restaurant();
		r2 = new Restaurant();
		ArrayList<String>menu = new ArrayList<String>();
		ArrayList<Integer>rates = new ArrayList<Integer>();

		r1.setName("Restaurant 1");
		r1.setLoginId("res1");
		r1.setPassword("abc123");

		menu.add("dish 1");
		rates.add(10);

		menu.add("dish 2");
		rates.add(20);

		menu.add("dish 3");
		rates.add(30);

		r1.setMenu(menu);
		r1.setRate(rates);


		r2.setName("Restaurant 2");
		r1.setLoginId("res2");
		r1.setPassword("def456");

		rates.clear();

		rates.add(30);
		rates.add(70);
		rates.add(90);

		menu.add("dish 4");
		rates.add(100);

		r2.setMenu(menu);
		r2.setRate(rates);

		listOfRestaurant.add(r1);
		listOfRestaurant.add(r2);

	}


	public static void main(String srgs[])
	{
		
		ArrayList<Restaurant>listOfRestaurant=new ArrayList<Restaurant>();
		ArrayList<Customer>listOfCustomer=new ArrayList<Customer>();
		Scanner sc= new Scanner(System.in);	
		Customer currentCustomer=null;
		Restaurant currentRestaurant=null;

		predefined(listOfRestaurant,listOfCustomer);

		while(true)
		{

			System.out.println("Who are you ?");
			System.out.println("1. Customer\n2.Restaurent Owner");
			int choice;
			choice=sc.nextInt();
			if(choice==1)
			{
				//Scanner sc= new Scanner(System.in);	
				System.out.println("Welcome");
				System.out.println("1. Sign Up\n2. Already have an account");
				//int choice;
				choice=sc.nextInt();
				if(choice==1)
				{
					Customer newCustomer=new Customer();
					newCustomer.signUp();
					listOfCustomer.add(newCustomer);
					currentCustomer=newCustomer;
				}
				else
				{
					while(true)
					{
						System.out.print("Login ID : ");
						String inputLoginId = sc.next();
						System.out.print("Password : ");
						String inputPassword = sc.next();
						int flag=0;
						for(Customer i:listOfCustomer)
						{
							if(i.validation(inputLoginId,inputPassword))
							{
								currentCustomer=i;
								flag=1;
								break;
							}
						}
						if(flag==1)
						{
							break;
						}
						else
						{
							System.out.println("Invalid LoginID/Password,please try again : ");
						}
						
					}


				}

				System.out.println("Welcome !!!");
				System.out.println("Please choose one option :");
				System.out.println("1. Place Order\n2. Update Personal Info");
				int next = sc.nextInt();
				if(next==1)
				{ 
					int totalAmount=currentCustomer.placeOrder(listOfRestaurant);
					System.out.println("Order Placed Successfully !!!\nOrder will arrive shortly\nAmount to be paid : "
										+totalAmount+"\n");
					System.out.println("Order recieved successfully !");
				}
				else
				{
					currentCustomer.updateInfo();
				}	
			}
			
			else
			{
				System.out.println("Welcome");
				System.out.println("1. Colaborate\n2. Already Colaborated");
				//int choice;
				choice=sc.nextInt();
				if(choice==1)
				{
					Restaurant newRestaurant=new Restaurant();
					newRestaurant.signUp();
					listOfRestaurant.add(newRestaurant);
					System.out.println("Your Restaurant has been Colaborated ,please submit required documents ");
					System.out.println("Welcome to our family !!!");
				}
				else
				{
					while(true)
					{
						System.out.print("Login ID : ");
						String inputLoginId = sc.next();
						System.out.print("Password : ");
						String inputPassword = sc.next();
						int flag=0;
						for(Restaurant i:listOfRestaurant)
						{
							if(i.validation(inputLoginId,inputPassword))
							{
								currentRestaurant=i;
								flag=1;
								break;
							}
						}
						if(flag==1)
						{
							break;
						}
						else
						{
							System.out.println("Invalid LoginID/Password,please try again : ");
						}
						
					}

					currentRestaurant.procede();

				}


			}

			System.out.print("Exit ? (y/n) ");
			char ch = sc.next().charAt(0);

			if(ch=='y')
			{
				break;
			}	

				
		}		
			

	}	
}