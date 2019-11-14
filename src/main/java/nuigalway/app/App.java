package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 21, "1/1/1998", 1);
        Student s2 = new Student("Joe", 20, "1/1/1997", 2);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);

        Module m1 = new Module("Software Engineering", 417, students);
        Module m2 = new Module("Machine Learning", 4101, students);
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);
        modules.add(m2);

        DateTime dt1 = new DateTime("2016-12-13T21:39:45.618-08:00");
        DateTime dt2 = new DateTime("2019-12-13T21:39:45.618-08:00");
        Program p1 = new Program("CS&IT", modules, students, dt1, dt2);
    }
}