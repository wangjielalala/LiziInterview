package wangjie.model;

import lombok.Data;

@Data
public class Course implements Comparable{
   private int id ;
   private String className;
   private String teacherName;
   private int weigh;

   public int compareTo(Object o) {
      return this.weigh - ((Course) o).getWeigh();
   }
}
