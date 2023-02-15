import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Grades {
    String lession;
    List<Double> grades;

    public Grades(String _lession)
    {
        lession = _lession;
        grades = new ArrayList<>();
    }

    public void addGrade(double x)
    {
        grades.add(x);
    }

    public double getAverrage()
    {
        double sum = 0;
        for (Double grade : grades)
        {
            sum += grade;
        }

        sum -= Collections.max(grades);
        sum -= Collections.min(grades);
        return sum/(grades.size()-2);
    }

}
public class Main {
    public static void main(String[] args) {

        Grades inf = new Grades("Informatyka");
        inf.addGrade(3);
        inf.addGrade(3);
        inf.addGrade(4);
        inf.addGrade(4);
        inf.addGrade(4);
        inf.addGrade(5);
        inf.addGrade(5);
        inf.addGrade(5);
        inf.addGrade(6);
        System.out.println("Average is: " + inf.getAverrage());

        Grades infTwo = new Grades("Informatyka");
        infTwo.addGrade(4);
        infTwo.addGrade(4);
        infTwo.addGrade(4);
        infTwo.addGrade(4);
        infTwo.addGrade(4);
        infTwo.addGrade(4);
        infTwo.addGrade(4);

        System.out.println("Average is: " + infTwo.getAverrage());
    }
}