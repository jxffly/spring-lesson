package tes.spring.spel.test2;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;


/**
 * Created by jinxiaofei.
 * Time 17/3/21 下午9:32
 * Desc 文件描述
 */
public class Lession2 {
    
    public static void main(String[] args) {
        
        
        // Turn on:
        // - auto null reference initialization
        // - auto collection growing
        SpelParserConfiguration config = new SpelParserConfiguration(true, true);
        
        ExpressionParser parser = new SpelExpressionParser(config);
        
        Expression expression = parser.parseExpression("list[3]");
        
        Demo demo = new Demo();
        
        Object o = expression.getValue(demo);
        System.out.println(o);
        System.out.println(demo.list.size());
        // demo.list will now be a real collection of 4 entries
        // Each entry is a new empty String
    }
}


class Demo {
    
    public List<String> list;
}