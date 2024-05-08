package system;

public abstract class Account
{

   protected String userName;
   private String password;
   private String fullName;
   private String email;
   double credit;
   int age;

   public Account(String userName, String fullName, String password, String email, double credit, int age)
   {
      this.userName = userName;
      this.fullName = fullName;
      this.password = password;
      this.email = email;
      this.credit = credit;
      this.age = age;
   }

   public String getUserName()
   {
      return this.userName;
   }

   public String getPassword()
   {
      return this.password;
   }
   
   public void setUserName(String userName)
   {
      this.userName = userName ;
      
   }

   public void setEmail(String email)
   {
      this.email = email;
   }
   
   abstract public void displayInfo();
   
}
