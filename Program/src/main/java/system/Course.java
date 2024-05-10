package system;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course
{

   private String title;
   private String description;
   private String[] content;
   private String catagory;
   private String difficulty;
   private LocalDate publishedDate;
   private Instructor instructor;
   private ArrayList<Student> enrolledStudents;
   private double price;
   private double avgRating;
   private int numberOfRatings;
   private int estimatedHours;
   private double CourseCompletionPercentage;
   private ArrayList<Quiz> quizzes;

   public Course(Instructor instructor, String title, String description, String[] content, String catagory, String difficulty, double price, int estimatedHours)
   {
      this.instructor = instructor;
      this.enrolledStudents = new ArrayList<>();
      this.title = title;
      this.description = description;
      this.content = content;
      this.catagory = catagory;
      this.difficulty = difficulty;
      this.price = price;
      this.estimatedHours = estimatedHours;
      this.publishedDate = LocalDate.now();
   }
   public Course()
   {
      quizzes = new ArrayList<>();
   }
   //Getters
   public String getTitle()
   {
      return this.title;
   }

   public String getDescription()
   {
      return description;
   }

   public String[] getContent()
   {
      return content;
   }

   public String getCatagory()
   {
      return catagory;
   }

   public String getDifficulty()
   {
      return difficulty;
   }

   public String getPublishedDate()
   {
      return publishedDate.toString();
   }

   public double getPrice()
   {
      return price;
   }

   public double getRating()
   {
      return avgRating;
   }

   public int getNumberOfStudents()
   {
      return enrolledStudents.size();
   }

   public int getEstimatedHours()
   {
      return estimatedHours;
   }

   public boolean isCourseFree()
   {
      return (price == 0);
   }
   //Setters

   public void setPrice(double price)
   {
      this.price = price;
   }

   // display
   public void displayInstrctors()
   {
      System.out.println("system.Course Instructors:" + instructor); // to_string method will be invoked.
   }

   public void displayInfo()
   {
      System.out.println("system.Course Info");
      System.out.println("Title: " + title);
      System.out.println("Description: " + description);
      System.out.println("Difficulty: " + difficulty);
      System.out.println("Catagory: " + catagory);
      System.out.println("Number of ratings: " + numberOfRatings);
      System.out.println("Number of enrolled students: " + getNumberOfStudents());
      System.out.println("Published date: " + getPublishedDate());
      System.out.println("Average rating: " + avgRating);
      System.out.println("Price: " + price);
   }

   // other
   public void enroll(Student student)
   {
      enrolledStudents.add(student);
   }

   public boolean isEnrolled(Student student)
   {
      for (var enrolledStudent : enrolledStudents)
      {
         if (enrolledStudent.equals(student))
         {
            return true;
         }
      }
      return false;
   }

   public void updateRating(int rating)
   {
      double total = avgRating * numberOfRatings;
      numberOfRatings++;
      avgRating = (total + rating) / numberOfRatings;
   }
   public void addQuiz(Quiz quiz)
   {
      quizzes.add(quiz);
   }
}
