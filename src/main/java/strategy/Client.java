package strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Client {
    private static int count = 0;
    @Getter
    private final int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;

    public Client(){
        id = ++count;
    }

    public Client(int id, String name, String email, int age, Gender sex) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
    }
}
