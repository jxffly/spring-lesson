package spring.model.depend;

import lombok.Data;


/**
 * Created by jinxiaofei.
 * Time 2017/8/4 上午9:54
 * Desc 文件描述
 */
@Data
public class Student {

    private String name;


    private Teacher teacher;
}
