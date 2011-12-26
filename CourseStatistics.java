/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemEducation;

import java.util.LinkedList;

/**
 *
 * @author amjad
 */
public class CourseStatistics {
    private Course course;
    public LinkedList<Student> passedStudents;
    public LinkedList<Student> failedStudents;
    private double passRate;

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * @return the passRate
     */
    public double getPassRate() {
        return passRate;
    }

    /**
     * @param passRate the passRate to set
     */
    public void setPassRate(double passRate) {
        this.passRate = passRate;
    }
    
    
    
}
