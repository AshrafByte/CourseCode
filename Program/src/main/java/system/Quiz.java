package system;

import java.util.Objects;

public class Quiz extends CourseWork{
    private double grade;
    static int quizNumber = 1;
    Quiz(double grade){
       // quizNumber++;
        this.grade=grade;
    }
    void passOrFail(double grade){
        double totalMark = 10;
        if(grade>= 0.7*totalMark)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Quiz"+quizNumber++ +"{" +
                "grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return Double.compare(grade, quiz.grade) == 0;
    }
}
