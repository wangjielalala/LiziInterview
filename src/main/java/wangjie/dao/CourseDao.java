package wangjie.dao;

import org.apache.ibatis.annotations.Param;
import wangjie.model.Course;

import java.util.List;

public interface CourseDao {
    List<Course> courseList(@Param("teacherName") String teacherName,@Param("reverse") Boolean reverse);
    List<Course> changeWeight(@Param("teacherName")String teactherName,@Param("fromid")Integer fromid ,@Param("toid")Integer toid);
}
