package proxy;

public class ProxyImage implements MyImage{
    private String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display(){
        if(realImage == null){
            RealImage realImage = new RealImage(this.filename);
        }
        realImage.display();
    }
}
