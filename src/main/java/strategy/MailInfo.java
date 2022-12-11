package strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MailInfo {
    private MailCode mailCode;
    private Client client;
    public String generate(){
        return mailCode.generate(client);
    }
}
