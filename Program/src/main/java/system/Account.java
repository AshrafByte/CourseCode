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

   public Account(String userName, String password, String email)
   {
      this.userName = userName;
      this.password = password;
      this.email = email;
   }

   public Account(String userName, String password, String email, String fullname)
   {
      this(userName, password, email);
      this.fullName = fullname;
   }

   public String getUserName()
   {
      return this.userName;
   }

   public String getPassword()
   {
      return this.password;
   }

   public String getFullName()
   {
      return fullName;
   }

   public String getEmail()
   {
      return email;
   }

   public double getCredit()
   {
      return credit;
   }

   public int getAge()
   {
      return age;
   }

   public void setUserName(String userName)
   {
      this.userName = userName;

   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public void setFullName(String fullName)
   {
      this.fullName = fullName;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public void setCredit(double credit)
   {
      this.credit = credit;
   }

   abstract public void displayInfo();

}
