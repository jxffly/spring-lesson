package fly.core;

import example.ManagerBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jinxiaofei on 16/4/13.
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
       /* UserService userService=applicationContext.getBean(UserService.class);
        userService.sayHello();
        userService.getResourceService().sayName("张三");
        userService.getTestService().sayTest("dasda");
        User user=userService.getUser();
        System.out.println(user);*/
       /* ComplextObj complextObj=applicationContext.getBean(ComplextObj.class);
        System.out.println(complextObj.getAdminEmails().getProperty("support"));
        System.out.println(complextObj.getSomeList());
        System.out.println(complextObj.getSomeMap());
        System.out.println(complextObj.getSomeSet());*/
       /* SubObject complextObj=applicationContext.getBean("child",SubObject.class);
        System.out.println(complextObj.getAdminEmails());*/
        ManagerBean managerBean=applicationContext.getBean(ManagerBean.class);
        managerBean.sayHello();
    }
}
