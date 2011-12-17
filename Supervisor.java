package SystemEducation;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:18 �
 */
public class Supervisor {

    public AcademicStaff m_AcademicStaff;
    public Courses m_Courses;
    public Semester m_Semester;
//Constrocture
    public Supervisor(AcademicStaff m_AcademicStaff, Courses m_Courses, Semester m_Semester) {
        this.m_AcademicStaff = new AcademicStaff(m_AcademicStaff.getFirst_Name(), m_AcademicStaff.getLast_Name(),
                m_AcademicStaff.getNational_Security_Number(), m_AcademicStaff.getAcadimec_Degree(), m_AcademicStaff.getDegree_Year());
        this.m_Courses = new Courses(m_Courses.getCourse_Name());
        this.m_Semester = new Semester(m_Semester.getDistinguishing_Number(), m_Semester.getPresent_Year(), m_Semester.getFinishing_Date());
    }

    public void finalize() throws Throwable {
    }
}
