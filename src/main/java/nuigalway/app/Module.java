package nuigalway.app;

import java.util.ArrayList;

public class Module {
    private String modName;
    private int Id;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Module(String modName, int Id, ArrayList<Student> students){
        this.modName = modName;
        this.Id = Id;
        this.students = students;
    }

    public String getModName() {
        return modName;
    }

    public int getId() {
        return Id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}