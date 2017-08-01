package fly.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.ManagerBean;
import example.SubObject;
import fly.model.ComplexObj;
import fly.model.User;
import fly.service.UserService;

/**
 * Created by jinxiaofei on 16/4/13.
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        UserService userService = applicationContext.getBean(UserService.class);
        userService.sayHello();
        userService.getResourceService().sayName("张三");
        userService.getTestService().sayTest("dasda");
        User user=userService.getUser();
        System.out.println(user);
        ComplexObj complextObj = applicationContext.getBean(ComplexObj.class);
        System.out.println(complextObj.getAdminEmails().getProperty("support"));
        System.out.println(complextObj.getSomeList());
        System.out.println(complextObj.getSomeMap());
        System.out.println(complextObj.getSomeSet());
        System.out.println(complextObj.getAdminEmails());
        ManagerBean managerBean=applicationContext.getBean(ManagerBean.class);
        managerBean.sayHello();
        SubObject subObject = applicationContext.getBean(SubObject.class);
        System.out.println(subObject.getAdminEmails());

    }
}
