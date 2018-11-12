package lab.profitsoft.main;

import lab.profitsoft.insurance.Contract;
import lab.profitsoft.people.Client;
import lab.profitsoft.people.InsuredPerson;
import lab.profitsoft.people.Type;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainClass {
    public static void main(String[] args) {
        Client clientE=new Client(Type.ENTITY,"Ivanushki","Pushkin street 6");
        Client clientI=new Client(Type.INDIVIDUAL,"Litvin", "Roman", "Mikhailovich","Nauki 14");
        InsuredPerson insuredPerson1;
        InsuredPerson insuredPerson2;
        InsuredPerson insuredPerson3;
        InsuredPerson insuredPerson4;
        InsuredPerson insuredPerson5;

        insuredPerson1=new InsuredPerson("Litvin", "Roman", "Mikhailovich",LocalDate.of(1998,6,10),100000,123456789);
        insuredPerson2=new InsuredPerson("George", "Martin",null,LocalDate.of(1990,10,21),10000,234567890);
        insuredPerson3=new InsuredPerson("Milo", "Gaines",null,LocalDate.of(1968,3,27),20000,345678901);
        insuredPerson4=new InsuredPerson("Dorothy", "Green", "Alexandrovna",LocalDate.of(1979,6,1),22000,456789012);
        insuredPerson5=new InsuredPerson("Doroth", "Gree", "Alexandro",LocalDate.of(1978,7,6),24000,456789012);


        LinkedHashSet<InsuredPerson> insuredPeople=new LinkedHashSet<>();// using LinkedHashSet makes us be sure that in each contract tax Identification number will be used only one time
        insuredPeople.add(insuredPerson2);
        insuredPeople.add(insuredPerson3);
        insuredPeople.add(insuredPerson4);
        insuredPeople.add(insuredPerson5);//insuredPerson5 is not added, because person with such identification number is already exist

        Contract contract1;
        Contract contract2;
        Contract contract3;

        contract1=new Contract(LocalDate.of(2018,9,12),LocalDate.of(2018,9,13),LocalDate.of(2021,9,12),clientE,insuredPeople);
        contract2=new Contract(LocalDate.of(2010,3,30),LocalDate.of(2010,3,31),LocalDate.of(2020,3,31),clientI,insuredPerson1);
        contract3=new Contract(LocalDate.of(2017,12,25),LocalDate.of(2017,12,26),LocalDate.of(2018,12,26),clientE,insuredPerson2,insuredPerson3);

        contract1.sortByBirthDate();

        System.out.println(contract1);
        System.out.println(contract2);
        System.out.println(contract3);

    }
}
