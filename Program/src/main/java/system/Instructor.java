package system;

public class Instructor extends Account
{

   public Instructor(String userName,String fullName,String password , String email , double credit , int age)
   {
      super(userName, fullName,password , email ,  credit ,  age);
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
   
   
   // this method should create course then add the course to the system.
   // use course class constrcutor
   public void createCourse(String title, String description, String[] content, String catagory, String difficulty, double price, int estimatedHours)
   {
      
   }
}
