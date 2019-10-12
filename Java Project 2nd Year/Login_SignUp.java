import java.util.Scanner;



 class Login_SignUp extends Menu
{
    public static void main(String args[])
     {

        int valid=0;
        System.out.println("Welcome To food odering system!");
        while(valid==0)
        {
            System.out.println("1.Login");
            System.out.println("2.SignUp");
            Scanner scan =new Scanner(System.in);
            int login=0,signup=0,status;
            status =scan.nextInt();
            if(status==1)
            {
                valid=1;
                // Userdata obj1 =new Userdata();
                // obj1.CreateUser();
                System.out.println("Enter UserName");
                String username=scan.nextLine();
                // System.out.println("Enter Password");
                String password=scan.nextLine();
                Menu.getMenu();
                System.out.println("Enter your food no");
                int order=scan.nextInt();
                System.out.println("You Ordered "+ item[order-1]);
            }
            else if( status==2)
            {
                valid=1;
                Userdata obj1 =new Userdata();
                obj1.CreateUser();

                Menu.getMenu();
                System.out.println("Enter your food no");
                int order=scan.nextInt();
                System.out.println("You Ordered "+ item[order-1]);
                
    
            }
    
            else
            {
                System.out.println("Please enter a valid option");
                valid=0;
            }
        }
        

    }
}