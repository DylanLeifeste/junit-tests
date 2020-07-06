import java.util.ArrayList;
import java.util.List;

public class Student {
    public long id;
    public String name;
    public List<Double> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public List<Double> getGrades() {
        return this.grades;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (double i = 0; i < grades.size(); i++) {
            sum += this.grades.get((int) i);
        }
        return sum / grades.size();
    }
}
