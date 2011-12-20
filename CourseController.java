package SystemEducation;

import java.util.LinkedList;
import java.util.ListIterator;

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
        
        public boolean add (Enrollement enrollement) {
            return Enrollements.add(enrollement);            
        }
        
        public boolean isRemovable(Enrollement enrollement){
            if (enrollement.m_Semester.getFinishing_Date() > 0)
                return true;
            else 
                return false;
        }
        
        public boolean add (Student student) {
            return Students.add(student);            
        }
        
        public boolean isRemovable(Student student){
            
            ListIterator<Enrollement> itr = Enrollements.listIterator();
            
            while (itr.hasNext()){
                if (itr.next().m_Student.equals(student)){
                    return false;
                }
                
            }            
            
            return true;
        }
        
        
        public boolean add (AcademicStaff academicStaff) {
            return AcademicStaffs.add(academicStaff);            
        }
        
        public boolean add (Supervisor supervisor) {
            return Supervisors.add(supervisor);            
        }
        
        public boolean add (Course course) {
            return Courses.add(course);            
        }
        
        public boolean add (Semester semester) {
            return Semesters.add(semester);            
        }        
         
        
        public boolean remove(Enrollement enrollement) {
            ListIterator<Enrollement> itr = Enrollements.listIterator();
            Enrollement tmpEnrollment;
            int index;
            
            while (itr.hasNext()){
                index = itr.nextIndex();
                tmpEnrollment = Enrollements.get(index);                
                                
                if(isRemovable(tmpEnrollment)){
                    Enrollements.remove(index);
                    return true;                    
                }
            }
            
            return false;
        }
        
        


	public CourseController(){

	}

	public void finalize() throws Throwable {

	}

}