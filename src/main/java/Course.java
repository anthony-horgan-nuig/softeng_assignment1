import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> enrolledStudents;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name){
        this.name = name;
    }

    public Course(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //TODO mutators for modules and enrolled students

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    // TODO maybe add error handling
    public void enrollStudent(Student s){
        if(this.enrolledStudents.contains(s)){
            return;
        }
        this.enrolledStudents.add(s);
    }

    public void attachModule(Module m){
        if(this.modules.contains(m)){
            return;
        }
        this.modules.add(m);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                ", enrolledStudents=" + enrolledStudents +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
