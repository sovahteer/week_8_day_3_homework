package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    private int id;
    private String name;
    private int age;
    private int enrolmentNumber;
    private Course course;
    private List<Lesson> lessons;

    public Student(String name, int age, int enrolmentNumber, Course course) {
        this.name = name;
        this.age = age;
        this.enrolmentNumber = enrolmentNumber;
        this.course = course;
        this.lessons = new ArrayList<Lesson>();
    }

    public Student(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "enrolment_number")
    public int getEnrolmentNumber() {
        return enrolmentNumber;
    }

    public void setEnrolmentNumber(int enrolmentNumber) {
        this.enrolmentNumber = enrolmentNumber;
    }

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="course_id", nullable = false, updatable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany()
    @JoinTable(
            name = "class",
            joinColumns = {@JoinColumn(name = "student_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn (
                    name = "lesson_id", nullable = false, updatable = false)}
    )

    public List<Lesson> getLessons(){
        return lessons;
    }

    public void setLessons(List<Lesson> lessons){
        this.lessons = lessons;
    }


    public void addLesson(Lesson lesson){
        this.lessons.add(lesson);
    }
}
