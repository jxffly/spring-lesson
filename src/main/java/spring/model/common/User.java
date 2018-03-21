package spring.model.common;

/**
 * Created by jinxiaofei on 16/4/13.
 */
public class User {
    private int id;
    private String name;
    private boolean status;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public boolean isStatus() {
        return status;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{"+this.id+","+this.name+","+this.status+"}";
    }
}
