package web_service;

import jakarta.xml.ws.Endpoint;
import ws.ws_banque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8080/ws_banque";
        Endpoint.publish(url, new ws_banque());
        System.out.println("runing in "  + url );
    }
}