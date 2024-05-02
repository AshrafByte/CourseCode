package system;

public class Student extends Account
{

   public Student(String userName)
   {
      super(userName);
   }

   @Override
   public String getUserName()
   {
      return this.userName;
   }
   
   public void enrollCourse()
   {
      
   }
}
