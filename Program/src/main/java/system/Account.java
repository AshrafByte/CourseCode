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

    

    public abstract void setFullName(String fullName) ;

   

    public abstract void setPassword(String password);

  

    public abstract void setCredit(double credit);

    public abstract void setAge(int age);

    public abstract String getFullName() ;

    public abstract String getLanguage() ;

    public abstract String getPassword() ;

    public abstract String getEmail() ;

    public abstract double getCredit() ;
    public abstract int getAge();
   
}