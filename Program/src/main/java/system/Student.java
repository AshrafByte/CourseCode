package system;

public class Student extends Account
{

   public Student(String userName, String fullName, String password, String email, double credit, int age)
   {
      super(userName, fullName, password, email, credit, age);
   }

   public Student(String userName, String password, String email)
   {
      super(userName, password, email);
   }

   public Student(String userName, String password, String email, String fullname)
   {
      super(userName, password, email, fullname);
   }

   @Override
   public void displayInfo()
   {
      System.out.println(getUserName());
      System.out.println(getPassword());
   }

   public void enrollCourse()
   {

   }
}
