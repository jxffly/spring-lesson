package tes.spring.spel.test1;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Created by jinxiaofei.
 * Time 17/2/28 上午10:16
 * Desc 文件描述
 */
public class InvokeTest {
    
    public static void main(String[] args) {
        // Create and set a calendar
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);
        
        // The constructor arguments are name, birthday, and nationality.
        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
        
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");
        Expression exp2 = parser.parseExpression("birth");
        
        EvaluationContext context = new StandardEvaluationContext(tesla);
        String name = (String) exp.getValue(context);
        Date date = exp2.getValue(context, Date.class);
        System.out.println(name);
        System.out.println(date);
        ExpressionParser parser2 = new SpelExpressionParser();
        Expression exp3 = parser2.parseExpression("nation");
        String nation = exp3.getValue(tesla, String.class);
        System.out.println(nation);
        
    }
    
}
