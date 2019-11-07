package wangjie.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wangjie.dao.CourseDao;
import wangjie.model.Course;
import wangjie.service.CourseService;
import wangjie.sortoperation_v1.Drag;
import wangjie.sortoperation_v1.IsortOperation;
import wangjie.sortoperation_v2.V2Proxy;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    CourseDao courseDao;

    @Autowired
    Drag drag;

    public List<Course> courseList(String teacherName,Boolean Reverse) {
        List<Course> courseList = courseDao.courseList(teacherName,Reverse);
        return courseList;
    }

    @Override
    public List<Course> changeWeight(String teactherName, Integer fromid, Integer toid) {
        // V1
//        return (List<Course>) drag.sortInvokeHandler(teactherName,fromid,toid);
        // V2
        IsortOperation isortOperation= (IsortOperation)Proxy.newProxyInstance(IsortOperation.class.getClassLoader(),new Class[] {IsortOperation.class},new V2Proxy(drag));
        return (List<Course>)isortOperation.sortInvokeHandler(teactherName,3,5);
    }
}
