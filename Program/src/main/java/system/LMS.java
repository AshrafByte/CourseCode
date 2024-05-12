package system;

import java.util.ArrayList;

public class LMS
{

   static private final ArrayList<Course> courses = new ArrayList<>();
   static private final ArrayList<Account> accounts = new ArrayList<>(); //

   static public void addCourse(Course course)
   {
      LMS.courses.add(course);
   }

   static public void removeCourse(Course course)
   {
      LMS.courses.remove(course);
   }

   static public void createAccount(Account account) //
   {
      LMS.accounts.add(account);
   }

   static public void deleteAccount(Account account) //**
   {
      LMS.accounts.remove(account);
   }

   static public Course findCourseByTitle(String courseTitle)
   {
      for (Course course : LMS.courses)
      {
         if (course.getTitle().equalsIgnoreCase(courseTitle))
         {
            return course;
         }
      }
      return null;
   }

   public static ArrayList<Course> getCourses()
   {
      return courses;
   }
   
   
   static public Account findAccount(String userName)
   {
      for (Account account : accounts)
      {
         if (account.getUserName().equals(userName))
         {
            return account;
         }
      }
      return null;
   }
   
   static public boolean isValidAccount(String userName , String password)
   {
      var account = findAccount(userName);
      
      if (account == null)
         return false;
      
      if (!password.equals(account.getPassword()))
         return false ;
      
      return true; 
   }
   
   static public void displayAllCourses()
   {
      for (Course course : LMS.courses)
      {
         System.out.println("system.Course Title: " + course.getTitle());
      }
   }

   static public void displayAllInstructors()
   {
      System.out.println("Instructors: ");
      for (Account account : LMS.accounts)
      {
         if (account instanceof Instructor)
         {
            System.out.println(account.getUserName());
         }
      }
   }

   static public void displayAllStudents()
   {
      System.out.println("Students: ");
      for (Account account : LMS.accounts)
      {
         if (account instanceof Student)
         {
            System.out.println(account.getUserName());
         }
      }
   }
}
