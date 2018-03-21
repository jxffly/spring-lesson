package spring.model.command;

/**
 * Created by jinxiaofei.
 * Time 2017/8/8 上午10:15
 * Desc 文件描述
 */
public abstract class CommandManager {

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();


    public Object process(Object commandState) {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }
}
