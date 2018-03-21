package spring.context.lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import spring.model.depend.Student;
import spring.model.depend.Teacher;


/**
 * Created by jinxiaofei.
 * Time 2017/8/4 上午9:39
 * Desc 文件描述
 */
public class Lesson002Autowiring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"lesson/auto-wiring.xml"});
        Teacher t1 = applicationContext.getBean(Teacher.class);
        Student s = applicationContext.getBean(Student.class);
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        System.out.println(t1);
        System.out.println(s);
    }
}
