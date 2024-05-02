package system;

public abstract class Account
{

   public String userName;

   public Account(String userName)
   {
      this.userName = userName;
   }
   
   public abstract String getUserName();
}
