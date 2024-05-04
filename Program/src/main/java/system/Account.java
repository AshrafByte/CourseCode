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
    
   
   

   public Account(String userName,String fullName,String password , String email , double credit , int age)
   {
      this.userName = userName;
      this.fullName = fullName;
      this.password = password;
      this.email = email;
      this.credit = credit;
      this.age = age;
   }
   
   public abstract String getUserName();
   public abstract void changeLanguage(String lang);
   public abstract void changeUserName(String name);
   public abstract void changeEmail(String email);
   public abstract void displayInfo();
}
