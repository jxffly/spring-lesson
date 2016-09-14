package fly.lesson1;

/**
 * Created by jinxiaofei on 16/4/27.
 */
public class Teacher {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void sayHello(){
        System.out.println(System.identityHashCode(this.getPerson()));
    }
}
