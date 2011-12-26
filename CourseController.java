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
            if (enrollement.m_Semester.getFinishing_Date() > 0 && enrollement.m_Semester.getPresent_Year() == currentSemester.getPresent_Year())
                return true;
            else 
                return false;
        }
                
        public int getIndex(Enrollement  enrollment){
            
            ListIterator<Enrollement> itr = enrollments.listIterator();
            Enrollement tmpEnrollement;
            int index;
            
            if(itr.hasNext()) {
                index = itr.nextIndex();
                tmpEnrollement = itr.next();
                if (tmpEnrollement.equals(enrollment))
                    return index;                        
                    
            }
            
            return -1;
        
        }
        
        public boolean removeMark(Enrollement enrollement) {
            int index = getIndex(enrollement);
            
            if (index > 0){
                if(isRemovable(enrollement)){
                    enrollement.setMarkSet(false);
                    return true;                    
                }
            }
            
            return false;
        }
        
        public boolean modifyMark(Enrollement enrollement, int newMark) {
            int index = getIndex(enrollement);
            
            if (index > 0){
                if(isRemovable(enrollement)){
                    enrollement.setMark(newMark);
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
        
        public int getIndex(Student student){
            
            ListIterator<Student> itr = students.listIterator();
            Student tmpStudent;
            int index;
            
            if(itr.hasNext()) {
                index = itr.nextIndex();
                tmpStudent = itr.next();
                if (tmpStudent.equals(student))
                    return index;                        
                    
            }
            
            return -1;
        
        }
        
        public boolean remove(Student student){
                        
            int index = getIndex(student);
            
            if (index > 0){
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
        
        public boolean isRemovable(Supervisor supervisor){
            
            if(supervisor.m_Semester.getPresent_Year() != currentSemester.getPresent_Year())
                return false;
            
            if (supervisor.m_Courses.enrollments.size() > 0)
                return false;
            
            return true;
            
        }
        
        public int getIndex(Supervisor supervisor){
            
            ListIterator<Supervisor> itr = supervisors.listIterator();
            Supervisor tmpSupervisor;
            int index;
            
            if(itr.hasNext()) {
                index = itr.nextIndex();
                tmpSupervisor = itr.next();
                if (tmpSupervisor.equals(supervisor))
                    return index;                        
                    
            }
            
            return -1;
        
        }
        
        public boolean remove(Supervisor supervisor){
                        
            int index = getIndex(supervisor);
            
            if (index > 0){
                if(isRemovable(supervisor)){
                    supervisors.remove(index);                        
                    return true;                        
                }
            }
            
            return false;            
        }      
        
        public boolean addCourse (Course course) {
            return courses.add(course);            
        }
        
        public boolean addSemester (Semester semester) {
            return semesters.add(semester);            
        }
        
        public CourseStatistics rawCourseStatistics(LinkedList<Enrollement> enrollments){
            ListIterator<Enrollement> itr = enrollments.listIterator();
            CourseStatistics courseStatistics = new CourseStatistics();
            Enrollement tmpEnrol;
            int suc = 0, fail = 0;
            if(itr.hasNext()) {
                tmpEnrol = itr.next();
                if(tmpEnrol.getMark() > 60){
                    suc++;
                    courseStatistics.passedStudents.add(tmpEnrol.m_Student);
                }
                else {
                    fail++;                
                    courseStatistics.failedStudents.add(tmpEnrol.m_Student);
                }
                    
            }
            
            courseStatistics.setPassRate(((double)suc)/(suc+fail));
            
            return courseStatistics;
        }
        
        public CourseStatistics courseStatistics(Course course) {
            return rawCourseStatistics(course.enrollments);
        }
        
        public void courseStatistics(Semester semester) {
            
            ListIterator<Enrollement> itr = enrollments.listIterator();
            
            Enrollement tmpEnrol;
            while (itr.hasNext()) {
                tmpEnrol = itr.next();
                if(tmpEnrol.m_Semester.equals(semester)){
                    courseStatistics(tmpEnrol.m_Courses);
                }
            }                

            
        }
        
        public void courseStatistics() {            
            ListIterator<Semester> itr = semesters.listIterator();
                        
            while (itr.hasNext()) {
                courseStatistics(itr.next());
                
            }                            
        }
        



	public CourseController(){

	}

	public void finalize() throws Throwable {

	}

}