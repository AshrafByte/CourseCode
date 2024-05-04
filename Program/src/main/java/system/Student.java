package system;

public class Student extends Account
{

   public Student(String userName,String fullName,String password , String email , double credit , int age)
   {
      super(userName, fullName, password ,  email ,  credit ,  age);
   }

   @Override
   public String getUserName()
   {
      return this.userName;
   }
   
    @Override
   public  void changeLanguage(String lang){}
   
   @Override
   public  void changeUserName(String name){}
   
   @Override
    public  void changeEmail(String email){}
    
   @Override
   public  void displayInfo(){}
   
   public void enrollCourse()
   {
      
   }
}
