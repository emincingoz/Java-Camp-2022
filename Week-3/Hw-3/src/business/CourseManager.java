package business;

import java.util.List;

import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("Kurs fiyatý 0 dan küçük olamaz.");
        }
        
        for (Course courses : courses) {
            if (courses.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Ayný kurs ismi kullanýlamaz.");
            }
        }
        
        courses.add(course);
        for (Logger logger : loggers) {
            logger.Log(course.getCourseName());
        }
    }
}
