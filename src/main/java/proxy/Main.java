package proxy;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        ProxyImage rimg = new ProxyImage("src/main/java/proxy/image.jpg");
        rimg.display();
    }
}
