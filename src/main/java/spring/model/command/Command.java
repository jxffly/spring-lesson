package spring.model.command;


import lombok.Data;


/**
 * Created by jinxiaofei.
 * Time 2017/8/8 上午10:16
 * Desc 文件描述
 */
@Data
public abstract class Command {

    private Object state;


    public Object execute() {
        System.out.println(state + "execute");
        return state;
    }


    public void say() {
        System.out.println("this is :" + this);
    }


    ;
}
