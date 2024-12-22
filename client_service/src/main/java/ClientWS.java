import proxy.WsBanque;
import proxy.WsBanque_Service;

public class ClientWS {
    WsBanque proxy = new WsBanque_Service().getWsBanquePort();
    //System.out.println(proxy.converte(100));
}
