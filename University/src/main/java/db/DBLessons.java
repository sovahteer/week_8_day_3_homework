package db;

import models.Lesson;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBLessons {

    private static Session session;

    public static List<Student> getStudentsForLesson(Lesson lesson){
        List<Student> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Student.class);
            cr.createAlias("lessons", "lesson");
            cr.add(Restrictions.eq("lesson.id", lesson.getId()));
            results = cr.list();
        }catch (HibernateException ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return results;
    }
}

