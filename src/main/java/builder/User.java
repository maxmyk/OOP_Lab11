package builder;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@ToString
public class User extends Human{
    private int age;
    private Gender gender;
    private double weight;
    private double height;
//    @Singular(value = "robota")
    @Singular
    private List<String> occupations;
}