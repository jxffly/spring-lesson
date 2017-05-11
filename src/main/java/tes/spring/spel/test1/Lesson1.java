package tes.spring.spel.test1;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


/**
 * Created by jinxiaofei.
 * Time 17/2/28 上午9:48
 * Desc 文件描述
 */
public class Lesson1 {
    
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
        Expression exp2 = parser.parseExpression("'Hello world'.concat('!')");
        Expression exp3 = parser.parseExpression("'Hello world'.bytes");
        Expression exp4 = parser.parseExpression("'Hello world'.bytes.length");
        String message = (String) exp.getValue();
        String message2 = exp2.getValue(String.class);
        byte[] arr = (byte[]) exp3.getValue();
        Integer length = exp4.getValue(Integer.class);
        System.out.println(arr);
        System.out.println(message);
        System.out.println(message2);
        System.out.println(length);
    }
    
}
