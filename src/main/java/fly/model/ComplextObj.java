package fly.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by jinxiaofei on 16/4/14.
 */
public class ComplextObj {
    private Properties adminEmails;
    private List someList;
    private Map someMap;
    private Set someSet;

    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public Properties getAdminEmails() {
        return adminEmails;
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public List getSomeList() {
        return someList;
    }

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }

    public Map getSomeMap() {
        return someMap;
    }

    public void setSomeSet(Set someSet) {
        this.someSet = someSet;
    }

    public Set getSomeSet() {
        return someSet;
    }
}
