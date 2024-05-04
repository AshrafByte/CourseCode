package system;

public abstract class Account
{
   
    String userName;
    String fullName;
    String language;
    String password;
    String email;
    double credit;
    int age;
    
   
   

   public Account(String userName)
   {
      this.userName = userName;
   }
   
   public abstract String getUserName();
}
