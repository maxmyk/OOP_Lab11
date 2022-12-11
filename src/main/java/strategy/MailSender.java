package strategy;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
public class MailSender {
    public void sendMail(MailInfo info) throws MailjetException, MailjetSocketTimeoutException {
        Client my_client = info.getClient();
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("c2d8e224b1efdbaefc97bc4b72b831b7", "b698dd51a4057a8b9d2523c2fbac7305", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", my_client.getEmail())
                                        .put("Name", my_client.getName()))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "bohdan.pelekh@ucu.edu.ua")
                                                .put("Name", "Богдан")))
                                .put(Emailv31.Message.SUBJECT, "Вітаю, Богдане")
                                .put(Emailv31.Message.TEXTPART, "Тут міг би бути нормальний текст")
                                .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />May the delivery force be with you!")
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
    public static void main(String[] args){
    }
}