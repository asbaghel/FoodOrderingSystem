import java.util.Scanner;


class Userdata
{   Scanner scan = new Scanner(System.in);
   private String Name;
   private long    phoneNo;
    private String City;

    public void CreateUser()
    {
        System.out.println("Enter your name:");
        Name=scan.nextLine();
        System.out.println("Enter your city:");
        City=scan.nextLine();
        System.out.println("Enter your Mobile no:");
        phoneNo=scan.nextLong();
        System.out.println("You have succesfully signed up!");
    }


}


 class User

{
    // public static void main(String[] args) {

    //     Userdata obj1=new Userdata();
    //     obj1.CreateUser();

        
    // }
}
