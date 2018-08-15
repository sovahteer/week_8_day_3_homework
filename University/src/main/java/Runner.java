import db.DBHelper;
import db.DBLessons;
import db.DBStudent;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course imd = new Course("Interactive Media Design", "BSC");
        DBHelper.save(imd);

        Student student1 = new Student("Euan", 28, 1234, imd);
        DBHelper.save(student1);
        Student student2 = new Student("Jimbob McGraw", 50, 5678, imd);
        DBHelper.save(student2);

        Lesson dbs = new Lesson("Databases", "D-23", imd);
        DBHelper.save(dbs);
        Lesson interfaces = new Lesson("Interfaces", "E-21", imd);
        DBHelper.save(interfaces);

        Mentor mentor1 = new Mentor("Harold");
        DBHelper.save(mentor1);

        DBStudent.addStudentToLesson(student1, dbs);
        DBStudent.addStudentToLesson(student2, dbs);

        List<Student> students = DBLessons.getStudentsForLesson(dbs);




    }
}
