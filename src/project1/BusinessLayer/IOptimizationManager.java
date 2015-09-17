/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.BusinessLayer;

import java.util.ArrayList;
import project1.Course;
import project1.Student;

/**
 *
 * @author ESmallwood
 */
public interface IOptimizationManager {
    
    String getMinimizedCourseSize(ArrayList<Course> courses, ArrayList<Student> students, 
                             int numberOfSemesters, int allowedNumberOfCoursesPerSemester);
    
    public String getCourseScheduleForStudent(ArrayList<Course> courses, ArrayList<Student> students, 
                                    int numberOfSemesters, 
                                    int allowedNumberOfCoursesPerSemester, int studentNumber);
}
