package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Max").age(18).gender(Gender.MALE).build();
        System.out.println(user);
    }
}
