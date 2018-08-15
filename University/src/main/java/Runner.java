import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Course imd = new Course("Interactive Media Design", "BSC");
        DBHelper.save(imd);

        Student student1 = new Student("Euan", 28, 1234);
        DBHelper.save(student1);

        Lesson dbs = new Lesson("Databases", "D-23");
        DBHelper.save(dbs);

        Mentor mentor1 = new Mentor("Harold");
        DBHelper.save(mentor1);


    }
}
