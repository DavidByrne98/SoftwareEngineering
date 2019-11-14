package nuigalway.app;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Program {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate, endDate;

    public Program(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate){
        this.name = name;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}