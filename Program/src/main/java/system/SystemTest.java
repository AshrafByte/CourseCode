package system;

public class SystemTest
{
   
   public static void main(String[] args)
   {
      testLMS();
   }
   
   static void testLMS()
   {
      LMS system = new LMS();
      
      Account[] newAccounts =
      {
         new Student("user1","user1a","43656","user1@gmail.com",2500,21),
         //new Instructor("user2"),
        // new Instructor("user3"),
         //new Student("user4")
      };
      
      // test adding accounts to the system.
      for (var newAccount : newAccounts)
         system.createAccount(newAccount);
      
      // test displaying students and instructors accounts on the system.
      system.displayAllStudents();
      system.displayAllInstructors();
      
      // test deleing account from the system.
      system.deleteAccount(newAccounts[0]);
      system.displayAllStudents();
   }
}
