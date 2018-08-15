package db;

import models.Lesson;
import models.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBStudent {

    private static Session session;
    private static Transaction transaction;

    public static void addStudentToLesson(Student student, Lesson lesson){
        student.addLesson(lesson);
        lesson.addStudent(student);
        DBHelper.update(student);
    }
}
