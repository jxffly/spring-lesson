package fly.lesson1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fly.lesson1.model.Person;
import fly.lesson1.model.Student;
import fly.lesson1.model.Teacher;


/**
 * Created by jinxiaofei on 16/4/13.
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        Teacher t=applicationContext.getBean(Teacher.class);
        Person p=applicationContext.getBean(Person.class);
        Student s = applicationContext.getBean(Student.class);
        t.sayHello();
        System.identityHashCode(p);
        s.sayHi();

    }
}
