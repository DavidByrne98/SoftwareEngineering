package nuigalway.app;

import static org.junit.Assert.assertEquals;
import org.joda.time.DateTime;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGetUsername() {
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

        assertEquals("Incorrect username!", "Tom\t21", s1.getUserName());

        assertEquals("Incorrect username!", "Tom\t21", p1.getModules().get(0).getStudents().get(0).getUserName());
        assertEquals("Incorrect username!", "Joe\t20", p1.getModules().get(0).getStudents().get(1).getUserName());
        assertEquals("Incorrect username!", "Tom\t21", p1.getModules().get(1).getStudents().get(0).getUserName());
        assertEquals("Incorrect username!", "Joe\t20", p1.getModules().get(1).getStudents().get(1).getUserName());
    }
}