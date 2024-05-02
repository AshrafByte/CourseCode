package system;

import java.util.ArrayList;
import java.util.Objects;

public class CourseWork {
    private int dead_line;

    public void setDead_line(int dead_line) {
        this.dead_line = dead_line;
    }

    public int getDead_line() {
        return dead_line;
    }
    double averageQuizesGrades(ArrayList <Quiz> list){
        double sum = 0;
        for (Quiz quiz : list)
            sum += quiz.getGrade();
        double average = sum / list.size();
        return average;
    }

    @Override
    public String toString() {
        return "CourseWork{" +
                "dead_line=" + dead_line +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseWork that = (CourseWork) o;
        return dead_line == that.dead_line;
    }

}
