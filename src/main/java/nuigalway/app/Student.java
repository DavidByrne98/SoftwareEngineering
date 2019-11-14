package nuigalway.app;

public class Student {
    private String name;
    private int age;
    private String dob;
    private int IdNumber;

    public Student(String name, int age, String dob, int IdNumber){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.IdNumber = IdNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDt(String dob) {
        this.dob = dob;
    }

    public void setIdNumber(int idNumber) {
        IdNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public String getUserName(){
        return getName() + "\t" + getAge();
    }
}