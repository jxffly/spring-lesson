package spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.interfaces.People;
import spring.model.sub.Boss;


/**
 * Created by jinxiaofei on 16/4/13.
 */
public class Parent2childBean {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        People boss = applicationContext.getBean(Boss.class);
        boss.say();
    }
}
