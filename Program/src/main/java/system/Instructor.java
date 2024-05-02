package system;

public class Instructor extends Account
{

   public Instructor(String userName)
   {
      super(userName);
   }
   
   @Override
   public String getUserName()
   {
      return this.userName;
   }
   
   // this method should create course then add the course to the system.
   // use course class constrcutor
   public void createCourse(String title, String description, String[] content, String catagory, String difficulty, double price, int estimatedHours)
   {
      
   }
}
