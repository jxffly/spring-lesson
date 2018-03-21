package spring.context.lesson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.interfaces.People;


/**
 * Created by jinxiaofei.
 * Time 2017/8/1 上午9:19
 * Desc 文件描述
 */
public class Lesson001BeanScopeTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Lesson001BeanScopeTest.class);


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"lesson/spring.xml"});
        LOGGER.info("test");
        People bean = applicationContext.getBean("boss", People.class);
        bean.say();
    }
}
