package wangjie.sortoperation_v1;

import org.springframework.stereotype.Component;
import wangjie.dao.CourseDao;
import wangjie.model.Course;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class Drag extends SortOperation{
    @Resource
    CourseDao courseDao;

    public  Object sortInvokeHandler(String teacherName,Integer fromid ,Integer toid){

        List<Course> courseList = courseDao.courseList(teacherName,false);
        //交换这个老师两个id对应课程的权重
//        List<Course> courseList = courseDao.changeWeight(teactherName,fromid ,toid);
        PriorityQueue<Course> priorityQueue = new PriorityQueue<>(IsortOperation.max);
        courseList.stream().forEach(e->{
            if (priorityQueue.size() < IsortOperation.max) {
                priorityQueue.add(e);
            } else {
                Course minPriority = priorityQueue.peek();
                if (e.compareTo(minPriority) > 0) {
                    priorityQueue.poll();
                    priorityQueue.add(e);
                }
            }
        });
        List<Course>  sortedEmp = priorityQueue.parallelStream().sorted(Comparator.comparing(obj->{
            return ((Course) obj).getWeigh();
        }).reversed()).collect(Collectors.toList());
        return sortedEmp;
    }
}
