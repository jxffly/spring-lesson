package spring.context;

import spring.model.sub.Boss;
import spring.model.sub.Staff;


/**
 * Created by jinxiaofei.
 * Time 2017/6/1 下午5:06
 * Desc 文件描述
 */
public class BeanFactory {


    public BeanFactory() {

    }


    public Boss getBoss() {

        return new Boss();
    }


    public Staff getStaff() {

        return new Staff();
    }

}
