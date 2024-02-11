public class Student extends Human{
    private String faculty;

    Student(String n, String s, String p, int a, String faculty) {
        super(n, s, p, a);
        this.faculty = faculty;
    }

    public Student() {
        super();
        faculty = "не записан";
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
