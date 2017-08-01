package fly.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fly.model.Boss;


/**
 * Created by jinxiaofei on 16/4/13.
 */
public class ApplicationContextTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        Boss boss = applicationContext.getBean(Boss.class);
        boss.sayHello();
    }
}
