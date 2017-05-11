package tes.spring.spel.test2;

import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by jinxiaofei.
 * Time 17/3/22 上午10:16
 * Desc 文件描述
 */
public class Test3 {
    
    public static void main(String[] args) {
        
        String[] vehicles = new String[]{"tesla", "audi", "benzi"};
        SpelExpressionParser parser = new SpelExpressionParser();
        List<String> names = new ArrayList<String>();
        names.add("aaa");
        names.add("bbb");
        // Inventions Array
        Person4 person4 = new Person4();
        person4.setAge(111);
        person4.setName("lily");
        StandardEvaluationContext teslaContext = new StandardEvaluationContext();
        teslaContext.setVariable("person", person4);
        System.out.println(parser.parseExpression("#person.name").getValue(teslaContext));
        
    }
    
}


class Person4 {
    
    private String name;
    
    private int age;
    
    
    public String getName() {
        
        return name;
    }
    
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    
    public int getAge() {
        
        return age;
    }
    
    
    public void setAge(int age) {
        
        this.age = age;
    }
    
    
    @Override
    public String toString() {
        
        return "Person4{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}