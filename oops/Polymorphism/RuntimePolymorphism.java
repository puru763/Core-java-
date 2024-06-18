package Polymorphism;

 class InfoService {

    public void InfoServiceMember() {
        System.out.println("InfoService Member");

    }

}

class Purvesh extends InfoService {
    public void InfoServiceMember() {
        System.out.println("Purvesh Krishnani InfoService  New Member");

    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        InfoService infoService = new InfoService();
        infoService.InfoServiceMember();

        InfoService infoService1 = new Purvesh();
        infoService1.InfoServiceMember();
    }
}
