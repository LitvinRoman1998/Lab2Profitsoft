package lab.profitsoft.insurance;

import lab.profitsoft.people.Client;
import lab.profitsoft.people.InsuredPerson;


import java.time.LocalDate;
import java.util.*;


public class Contract {
    int number;
    LocalDate conclusionDate;
    LocalDate startDate;
    LocalDate endDate;
    Client client;
    ArrayList<InsuredPerson> insuredPeople;

    static int numOfContract=0;

    public Contract(LocalDate conclusionDate, LocalDate startDate, LocalDate endDate, Client client, InsuredPerson ... insuredPeople){
    this(conclusionDate, startDate, endDate, client,new LinkedHashSet<>(Set.of(insuredPeople)));
    }


    public Contract(LocalDate conclusionDate, LocalDate startDate, LocalDate endDate, Client client, LinkedHashSet<InsuredPerson> insuredPeople){
        this.number = numOfContract++;
        this.conclusionDate = conclusionDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.insuredPeople = new ArrayList<>(insuredPeople);;
    }

    public int totalInsuranceCost(){
        int contractCost=0;
        for (InsuredPerson insuredPerson:insuredPeople){
            contractCost+=insuredPerson.getInsurancePrice();
        }
        return contractCost;
    }

    public InsuredPerson findByTaxIdentificationNumber(int taxIdentificationNumber){
        for (InsuredPerson insuredperson:insuredPeople) {
            if(taxIdentificationNumber==insuredperson.getTaxIdentificationNumber()){
                return insuredperson;
            }
        }
        return null;
    }

    public void sortByAlphabet(){
        insuredPeople.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println(insuredPeople);
    }

    public void sortByBirthDate(){
        insuredPeople.sort((Comparator<InsuredPerson>) (o1, o2) ->o1.getBirthDay().compareTo(o2.getBirthDay()));
        System.out.println(insuredPeople);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "number: " + number +
                ", conclusionDate: " + conclusionDate +
                ", startDate: " + startDate +
                ", endDate: " + endDate +
                ", client: " + client +
                ", insuredPeople: " + insuredPeople +
                ", total Insurance sum: "+totalInsuranceCost()+
                '}';
    }
}
