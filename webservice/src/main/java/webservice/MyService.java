package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.Date;

@WebService
public class MyService {
    private String adress;
    Object lock = new Object();
    public MyService() {

    }

    public MyService(String adress) {
        this.adress = adress;
        init();
    }

    public void init(){
        System.out.println("启动中，地址为"+adress);
        Endpoint.publish(adress,this);
    }
@WebMethod
    public String sayhello(String name){
    synchronized (lock){
        long starttime = new Date().getTime();
        System.out.println(starttime +"==开始=="+name);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    long endtime = new Date().getTime();
    System.out.println("spendtime"+ (endtime-starttime));
    System.out.println(endtime+"==结束=="+name);
    return "hello "+name;
    }
}


}
