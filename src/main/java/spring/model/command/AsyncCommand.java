package spring.model.command;

/**
 * Created by jinxiaofei.
 * Time 2017/8/8 上午10:19
 * Desc 文件描述
 */
public class AsyncCommand extends Command {

    @Override
    public void say() {
        System.out.println("this is my command:+" + this);
    }

}
