package spring.context.lesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.command.CommandManager;


/**
 * Created by jinxiaofei.
 * Time 2017/8/4 上午9:39
 * Desc 文件描述
 */
public class Lesson003LookUp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"lesson/lookup.xml"});
        CommandManager commandManager = applicationContext.getBean(CommandManager.class);
        CommandManager commandManager2 = applicationContext.getBean(CommandManager.class);

        commandManager.process(new Object());
        commandManager2.process(new Object());

    }
}
