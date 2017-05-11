package tes.spring.spel.test2;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


/**
 * Created by jinxiaofei.
 * Time 17/3/22 上午10:33
 * Desc 文件描述
 */
public class Test4method {
    
    public static void main(String[] args) throws NoSuchMethodException {
        
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        
        context.registerFunction("reverseString", Demo2.class.getDeclaredMethod("sayHi", new Class[]{String.class, Integer.class}));
        
        String helloWorldReversed = parser.parseExpression("#reverseString('hello',2)").getValue(context, String.class);
        System.out.println(helloWorldReversed);
    }
    
}


class Demo2 {
    
    String sayHi(String name, Integer times) {
        
        for (int i = 0; i < times; i++) {
            System.out.println("say :" + name + ",time:" + i);
            
        }
        return "done";
    }
}