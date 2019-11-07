package wangjie.service;

import wangjie.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> courseList(String teacherName,Boolean reverse);
    List<Course> changeWeight(String teactherName, Integer fromid , Integer toid);
}
