package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:14 �
 */
public class Enrollement {
//Data mathod
	public Student m_Student;
	public Courses m_Courses;
	public Semester m_Semester;
        private int Mark ;

//Constructor
    public Enrollement(Student m_Student, Courses m_Courses, Semester m_Semester, int Mark) {
        this.m_Student = new Student(m_Student.getFirst_Name(), m_Student.getLast_Name(), m_Student.getNational_Security_Number()) ;
        this.m_Courses = new Courses(m_Courses.getCourse_Name());
        this.m_Semester = new Semester(m_Semester.getDistinguishing_Number(),m_Semester.getPresent_Year(),m_Semester.getFinishing_Date());
        setMark(Mark);
    }


//Method Set
        public void setMark(int Mark) {
            this.Mark = Mark;
        }

//Method Get
        public int getMark() {
            return Mark;
        }

	public Enrollement(){

	}

	public void finalize() throws Throwable {

	}

}