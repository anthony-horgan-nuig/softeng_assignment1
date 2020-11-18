import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> associatedCourses;

    public Module(String name, String id){
        this.name = name;
        this.id = id;
    }

    //TODO mutators for courses and enrolled students

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void attachStudent(Student s){
        if(this.students.contains(s)){
            return;
        }
        this.students.add(s);
        //add module to student
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", students=" + students +
                ", associatedCourses=" + associatedCourses +
                '}';
    }
}
