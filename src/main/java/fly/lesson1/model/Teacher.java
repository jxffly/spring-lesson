package fly.lesson1.model;

/**
 * Created by jinxiaofei on 16/4/27.
 */
public class Teacher {
    private Person person;


    public void sayHello() {
        System.out.println(System.identityHashCode(this.getPerson()));
    }


    public Person getPerson() {
        return person;
    }


    public void setPerson(Person person) {
        this.person = person;
    }
}
