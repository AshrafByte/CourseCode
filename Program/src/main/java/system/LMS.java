package system;

import java.util.ArrayList;

public class LMS
{

   private final ArrayList<Course> courses = new ArrayList<>();
   private final ArrayList<Account> accounts = new ArrayList<>(); //

   public void addCourse(Course course)
   {
      this.courses.add(course);
   }

   public void removeCourse(Course course)
   {
      this.courses.remove(course);
   }

   public void createAccount(Account account) //
   {
      this.accounts.add(account);
   }

   public void deleteAccount(Account account) //**
   {
      this.accounts.remove(account);
   }

   public Course findCourseByTitle(String courseTitle)
   {
      for (Course course : this.courses)
      {
         if (course.getTitle().equalsIgnoreCase(courseTitle))
         {
            return course;
         }
      }
      return null;
   }

   public Account findAccount(String userName)
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

   public void displayAllCourses()
   {
      for (Course course : this.courses)
      {
         System.out.println("system.Course Title: " + course.getTitle());
      }
   }

   public void displayAllInstructors()
   {
      System.out.println("Instructors: ");
      for (Account account : this.accounts)
      {
         if (account instanceof Instructor)
         {
            System.out.println(account.getUserName());
         }
      }
   }

   public void displayAllStudents()
   {
      System.out.println("Students: ");
      for (Account account : this.accounts)
      {
         if (account instanceof Student)
         {
            System.out.println(account.getUserName());
         }
      }
   }
}
