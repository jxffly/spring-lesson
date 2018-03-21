package spring.context;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.common.Person;
import spring.model.common.Student;
import spring.model.common.Teacher;


/**
 * Created by jinxiaofei on 16/4/13.
 */
public class PropertyInitializeTest {
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
