package spring.model.interfaces;

/**
 * Created by jinxiaofei.
 * Time 2017/6/1 下午5:07
 * Desc 文件描述
 */
public interface People {

    int age = 10;

    default void say() {

        System.out.println("people");
    }

}
