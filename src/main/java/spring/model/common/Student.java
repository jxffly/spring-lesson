package spring.model.common;

/**
 * Created by jinxiaofei.
 * Time 2017/5/26 下午8:03
 * Desc 文件描述
 */
public class Student {

    private String name;


    public String getName() {

        return name;
    }


    public void sayHi() {

        System.out.println("i am a student ,my name is :" + this.name);
    }


    public void setName(String name) {

        this.name = name;
    }
}
