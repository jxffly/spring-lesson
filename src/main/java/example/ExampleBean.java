package example;

/**
 * Created by jinxiaofei on 16/4/14.
 */
public class ExampleBean {
    ExampleBean(){
        System.out.println("延时初始化开始........");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("延时初始化");
    }
}
