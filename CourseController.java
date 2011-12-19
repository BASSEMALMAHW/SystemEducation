package SystemEducation;

import java.util.LinkedList;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:11 �
 */
public class CourseController {
        LinkedList<Student> Students;
        LinkedList<AcademicStaff> AcademicStaffs;    
        LinkedList<Supervisor> Supervisors;   
        LinkedList<Course> Courses;   
        LinkedList<Semester> Semesters;   
        LinkedList<Enrollement> Enrollements;           
    
        public boolean add (Object object) {
            
            if (object instanceof Student)
                Students.add((Student)object);
            
            else if (object instanceof AcademicStaff)
                AcademicStaffs.add((AcademicStaff)object);
            
            else if (object instanceof Supervisor)
                Supervisors.add((Supervisor)object);
            
            else if (object instanceof Course)
                Courses.add((Course)object);
            
            else if (object instanceof Semester)
                Semesters.add((Semester)object);
            
            else if (object instanceof Enrollement)
                Enrollements.add((Enrollement)object);
            
            else 
                return false;            
        
            return true;
        }

	public CourseController(){

	}

	public void finalize() throws Throwable {

	}

}