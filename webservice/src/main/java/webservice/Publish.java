package webservice;

public class Publish {
    public static void main(String[] args) {
    String address="http://10.3.1.44:7799/xiot/BasicCmdsender?wsdl";
        MyService service = new MyService(address);
    }

}
