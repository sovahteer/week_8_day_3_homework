import db.DBHelper;
import models.Course;

public class Runner {

    public static void main(String[] args) {

        Course imd = new Course("Interactive Media Design", "BSC");
        DBHelper.save(imd);


    }
}
