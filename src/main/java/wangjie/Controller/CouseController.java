package wangjie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import wangjie.model.Course;
import wangjie.service.CourseService;
import wangjie.sortoperation_v1.SortType;

import java.util.List;

@RestController
public class CouseController {
    @Autowired
    CourseService courseService;
    @PostMapping("getCourseList")
    public List<Course> couseList(String teacherName,String type) {
        List<Course> courseList = null;
        if(SortType.REVERSE.getValue().equals(type)){
            courseList = courseService.courseList(teacherName,false);
        }else if(SortType.DRAG.getValue().equals(type)){
            courseList = courseService.changeWeight(teacherName,3,5);
        }
        return courseList;
    }
}

