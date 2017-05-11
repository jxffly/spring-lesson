package tes.spring.spel.test1;

import java.util.Date;


/**
 * Created by jinxiaofei.
 * Time 17/2/28 上午10:17
 * Desc 文件描述
 */
public class Inventor {
    
    private String name;
    
    private Date birth;
    
    private String nation;
    
    
    public Inventor(String name, Date birth, String nation) {
        
        this.name = name;
        this.birth = birth;
        this.nation = nation;
    }
    
    
    public String getName() {
        
        return name;
    }
    
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    
    public Date getBirth() {
        
        return birth;
    }
    
    
    public void setBirth(Date birth) {
        
        this.birth = birth;
    }
    
    
    public String getNation() {
        
        return nation;
    }
    
    
    public void setNation(String nation) {
        
        this.nation = nation;
    }
}
