package spring.model.depend;

import lombok.Data;


/**
 * Created by jinxiaofei.
 * Time 2017/8/4 上午9:55
 * Desc 文件描述
 */
@Data
public class Teacher {

    private String name;


    public Teacher(String name) {
        this.name = name;
    }
}
