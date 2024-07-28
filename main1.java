class Singleton
{
    private static Singleton object=null;
    private Singleton()
    {

    }
    public  static Singleton method()
    {
        if(object==null)
        {
            object =new Singleton();

        }
        return object;
    }

}
public class main1
{
   public static void main(String args[])
   {
      @SuppressWarnings("unused")
    Singleton S1= Singleton.method();
    @SuppressWarnings("unused")
    Singleton S2= Singleton.method();
    System.out.print(S1+"  "+S2);

   }
}
    
