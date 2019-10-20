import java.util.*;
import java.util.ArrayList;

class Customer extends Helper
{

	private String loginId;
	private String password;
	private String address;
	private String phoneNo;
	private String mailId;

	

	public void signUp()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter username (Your LoginID) :");
		String loginId = sc.nextLine();
		setLoginId(loginId);
		
		System.out.println("Please enter the password");
		String password = sc.nextLine();
		setPassword(password);

		System.out.println("Please enter your Email ID:");
		String mailId = sc.nextLine();
		setMailId(mailId);
		
		System.out.println("Please enter your address (The food will be delivered here) :");
		String address = sc.nextLine();
		setAddress(address);
		
		System.out.println("Please enter your Phone Number");
		String phoneNo = sc.nextLine();
		setPhoneNo(phoneNo);
		
		System.out.println("Account created Successfully !!!");
	}
	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public void setMailId(String mailId)
	{
		this.mailId = mailId;
	}
	
	public boolean validation(String inputLoginId,String inputPassword)
	{
		return checking(this.loginId,this.password,inputLoginId,inputPassword);
	}

	public void updateInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to update ?");
		System.out.println("1. LoginID");
		System.out.println("2. Password");
		System.out.println("3. Address");
		System.out.println("4. phone No.");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Please enter loginId : ");
				loginId=sc.nextLine();
				break;
			case 2:
				System.out.println("Please enter Password : ");
				password = sc.nextLine();
				break;
			case 3:
				System.out.println("Please enter Address : ");
				address = sc.nextLine();
				break;
			case 4:
				System.out.println("Please enter phone No. : ");
				phoneNo = sc.nextLine();
				break;		
		}

		System.out.println("Changes saved ");
	}

	public int placeOrder(ArrayList<Restaurant> listOfRestaurant)
	{
		Scanner sc= new Scanner(System.in);
		int choice,totalAmount=0;
		System.out.println("Which Restaurant would you like to choose ?\n");
		
		int count=1;
		for(Restaurant i:listOfRestaurant)
		{
			System.out.println(count+". "+i.name);
			count++;
		}
		choice=sc.nextInt();
		int restNo=choice-1;
		System.out.println("Please choose the dish :\n");
		Restaurant R = listOfRestaurant.get(restNo);
		R.displayMenu();
		char cont='y';
		while(cont=='y')
				{
					int choice2=sc.nextInt();
					System.out.print("Quantity : ");
					int quantity=sc.nextInt();
					totalAmount+=(R.getRate(choice2))*quantity;
					System.out.print("Any other dish (y/n) ? ");
					cont=sc.next().charAt(0);
					if(cont=='n')
					{
						System.out.println("Place Order ?");
						cont=sc.next().charAt(0);
						if(cont=='y')
						{
							cont='n';
						}
					}
				}

		return totalAmount;
	}

	
}