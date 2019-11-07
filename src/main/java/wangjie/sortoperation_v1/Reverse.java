package wangjie.sortoperation_v1;

import org.springframework.stereotype.Component;
import wangjie.dao.CourseDao;
import wangjie.model.Course;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Reverse extends SortOperation implements IsortOperation{

    @Resource
    CourseDao courseDao;

    public Object sortInvokeHandler(String teactherName) {
        List<Course> courseList = courseDao.courseList(teactherName,true);
        return courseList;
    }
}
