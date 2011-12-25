package SystemEducation;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author bassem
 * @version 1.0
 * @created 10-����������-2011 08:03:11 �
 */
public class CourseController {
        LinkedList<Student> students;
        LinkedList<AcademicStaff> academics;    
        LinkedList<Supervisor> supervisors;   
        LinkedList<Course> courses;   
        LinkedList<Semester> semesters;   
        LinkedList<Enrollement> enrollments;   
        
        Semester currentSemester;
        
        
        
        public boolean add (Enrollement enrollement) {
            return enrollments.add(enrollement);            
        }
        
        public boolean isRemovable(Enrollement enrollement){
            if (enrollement.m_Semester.getFinishing_Date() > 0)
                return true;
            else 
                return false;
        }
        
        public boolean remove(Enrollement enrollement) {
            ListIterator<Enrollement> itr = enrollments.listIterator();
            Enrollement tmpEnrollment;
            int index;
            
            while (itr.hasNext()){
                index = itr.nextIndex();
                tmpEnrollment = enrollments.get(index);                
                                
                if(isRemovable(tmpEnrollment)){
                    enrollments.remove(index);
                    return true;                    
                }
            }
            
            return false;
        }     
        
        public boolean addStudent (Student student) {
            return students.add(student);            
        }
        
        public boolean isRemovable(Student student){
            
            ListIterator<Enrollement> itr = student.enrollments.listIterator();
            
            if (itr.hasNext()){
                if (itr.next().isMarkSet()){
                    return false;
                }
                
            }            
            
            return true;
        }
        
        public boolean remove(Student student){
            ListIterator<Student> itr = students.listIterator();
            Student tmpStudent;
            int index;
            
            if(itr.hasNext()) {
                index = itr.nextIndex();
                tmpStudent = itr.next();
                if (tmpStudent.equals(student))
                    if(isRemovable(student)){
                        students.remove(index);                        
                        return true;                        
                    }
            }
            
            return false;
            
        }        
        
        public boolean addAcademic (AcademicStaff academicStaff) {
            return academics.add(academicStaff);            
        }
        
        public boolean isRemovable(AcademicStaff academic){
            
            if (academic.supervisors.size() > 0)
                return false;
            else
                return true;
            
        }
        
        public int getIndex(AcademicStaff academic){
            
            ListIterator<AcademicStaff> itr = academics.listIterator();
            AcademicStaff tmpAcademic;
            int index;
            
            if(itr.hasNext()) {
                index = itr.nextIndex();
                tmpAcademic = itr.next();
                if (tmpAcademic.equals(academic))
                    return index;                        
                    
            }
            
            return -1;
        
        }
        
        public boolean removeAcademic(AcademicStaff academic){
            
            int index = getIndex(academic);
            
            if (index > 0){
                if(isRemovable(academic)){
                    academics.remove(index);                        
                    return true;                        
                }
            }
            
            
            return false;
        
        }
        
        public boolean add (Supervisor supervisor) {
            return supervisors.add(supervisor);            
        }
        
        public boolean addCourse (Course course) {
            return courses.add(course);            
        }
        
        public boolean addSemester (Semester semester) {
            return semesters.add(semester);            
        }        
         
        
   


	public CourseController(){

	}

	public void finalize() throws Throwable {

	}

}