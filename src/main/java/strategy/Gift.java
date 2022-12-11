package strategy;

public class Gift implements MailCode{
    private static final String TEMPLATE = "Cyber Monday! Hi, %NAME, get your gift right now!";
    @Override
    public String generate(Client client){
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
