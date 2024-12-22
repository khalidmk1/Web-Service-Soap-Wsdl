package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO PLAIN OLDE JAVA OBJECT : Simple java class
@WebService(serviceName = "ws_banque")
public class ws_banque  {

    @WebMethod()
    public double converte( @WebParam(name = "montant") double montant) {
        return montant * 10.4;
    }

    @WebMethod
    public Compte getCompte (@WebParam(name = "code") int code) {
        return new Compte(code , Math.random()*9888 , new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1 , Math.random()*9888 , new Date()),
                new Compte(2 , Math.random()*9888 , new Date()),
                new Compte(3 , Math.random()*9888 , new Date())
        );
    }



}
