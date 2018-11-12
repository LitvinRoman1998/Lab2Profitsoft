package lab.profitsoft.people;

public class Client extends Person {
    Type type;
    String companyName;
    String adress;

    public Client(Type type, String name, String adress) {
        this.type = type;
        this.companyName=name;
        this.adress=adress;
    }
    public Client(Type type,String lastName,String firstName,String patronimic,String adress){
        super(lastName,firstName,patronimic);
        this.type=type;
        this.adress=adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "type:" + type+(type==Type.INDIVIDUAL?", Full name:"+lastName+" "+firstName+" "+patronimic:"Company name:"+companyName) +
                ", adress:'" + adress + '\'' +
                '}';
    }
}
