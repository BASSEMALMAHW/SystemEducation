package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:12 �
 */
public class Course {

//Data Member
        private String Course_Name;
        private int course_ID;
        private static  int coourse_I_D;

//Constructor
    public Course(String Course_Name) {
        setCourse_Name(Course_Name);
        this.coourse_I_D = coourse_I_D +1;
        this.course_ID =this.coourse_I_D;
    }

//Method Set
        public void setCourse_Name(String Course_Name) {
        this.Course_Name = Course_Name;
        }
//Method Get
    public String getCourse_Name() {
        return Course_Name;
    }

    public int getCoourse_ID() {
        return course_ID;
    }

    public static int getCoourse_I_D() {
        return coourse_I_D;
    }


	public void finalize() throws Throwable {

	}

}