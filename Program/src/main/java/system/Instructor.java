package system;

public class Instructor extends Account
{

   public Instructor(String userName, String fullName, String password, String email, double credit, int age)
   {
      super(userName, fullName, password, email, credit, age);
   }

   public Instructor(String userName, String password, String email)
   {
      super(userName, password, email);
   }

   public Instructor(String userName, String password, String email, String fullname)
   {
      super(userName, password, email, fullname);
   }

   @Override
   public void displayInfo()
   {
      System.out.println(getUserName());
      System.out.println(getPassword());
   }

   // this method should create course then add the course to the system.
   // use course class constrcutor
   public void createCourse(String title, String description, String[] content, String catagory, String difficulty, double price, int estimatedHours)
   {

   }
}
