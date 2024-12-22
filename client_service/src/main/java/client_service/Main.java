package client_service;

import proxy.Compte;
import proxy.WsBanque_Service;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WsBanque_Service proxy = (WsBanque_Service) new WsBanque_Service().getWsBanquePort();

        Compte cp = proxy.getWsBanquePort().getCompte(4);
        System.out.println("----------------------------------------------------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}