package system;

import java.util.ArrayList;

public class Student extends Account
{
   ArrayList<Course>enrolledCourses=new ArrayList();
   ArrayList<Course>wishlistCourses=new ArrayList();
   
   
   
   public Student(String userName,String fullName,String password , String email , double credit , int age)
   {
      super(userName, fullName, password ,  email ,  credit ,  age);
   }

    public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void setWishlistCourses(ArrayList<Course> wishlistCourses) {
        this.wishlistCourses = wishlistCourses;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public ArrayList<Course> getWishlistCourses() {
        return wishlistCourses;
    }

 

   @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

   

   @Override
    public void setPassword(String password) {
        this.password = password;
    }


   @Override
    public void setCredit(double credit) {
        this.credit = credit;
    }

   @Override
    public void setAge(int age) {
        this.age = age;
    }

   @Override
    public String getFullName() {
        return fullName;
    }

   @Override
    public String getLanguage() {
        return language;
    }

   @Override
    public String getPassword() {
        return password;
    }

   @Override
    public String getEmail() {
        return email;
    }

   @Override
    public double getCredit() {
        return credit;
    }

   @Override
    public int getAge() {
        return age;
    }
   
   
   @Override
   public String getUserName()
   {
      return this.userName;
   }
   
    @Override
   public  void changeLanguage(String lang){
   this.language=lang;
   }
   
   @Override
   public  void changeUserName(String name){
   this.userName=name;
   }
   
   @Override
    public  void changeEmail(String email){
    this.email=email;
    }
    
   @Override
    public  void displayInfo(){
      System.out.println(this.userName+ this.fullName + this.email + this.credit + this.age);
   }
   
   public void enrollCourse(Course course)
   {
     enrolledCourses.add(course);
   }

    @Override
    public String toString() {
        return "Student{" + "enrolledCourses=" + enrolledCourses + ", wishlistCourses=" + wishlistCourses + '}';
    }

   
   /*public int showCourseGrades(CourseWork course){
      return course.getGrade();    
    }*/
    
   /* public int showcourseprogress() {
      
        return ((double) completedModules / totalModules) * 100.0;
      
    }*/
    
    
    public void displayEnrolledCourses (){
       System.out.print("EnrolledCourses : " + enrolledCourses);
    } 
    
    public void addCredit(double credit ){
        if (credit<0){
        System.out.print("invalid operation");
        }
        this.credit+=credit;
    }
    
    public void addToWishList( Course course){
        wishlistCourses.add(course);
    }
}
