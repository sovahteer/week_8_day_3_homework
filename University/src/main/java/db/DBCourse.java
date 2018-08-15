package db;

import models.Course;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCourse {

    private static Session session;

    public static List<Student> getStudentsforCourse(Course course){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> results = null;
        try{
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("Course", course));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }

    public static List<Student> getLessonsforCourse(Course course){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Student> results = null;
        try{
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("Course", course));
            results = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }
}
