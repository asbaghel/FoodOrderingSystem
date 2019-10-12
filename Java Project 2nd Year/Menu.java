class Menu
{
  public static String item[]={"Dosa","idli","vada","Noodles","Fried Rice"};
  
    public static  void getMenu()
    {
      
          String item6="chilli Paneer";
            int n=5;

          for(int i=0;i<n;i++)
          {

            System.out.println(i+1+"." +item[i]);
          }
        
        
    }
}