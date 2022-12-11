package strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import lombok.Getter;

import java.util.List;

public class MailBox {
    private final MailSender sender = new MailSender();
    @Getter
    private List<MailInfo> infos;
    public void addMailinfo(MailInfo info){
        infos.add(info);
    }
    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo info:infos) {
            sender.sendMail(info);
        }
    }
}
