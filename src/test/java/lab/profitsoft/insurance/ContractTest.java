package lab.profitsoft.insurance;

import lab.profitsoft.people.Client;
import lab.profitsoft.people.InsuredPerson;
import lab.profitsoft.people.Type;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ContractTest {
    @Test
    public void totalInsuranceCostTest(){
        Client client=new Client(Type.ENTITY,"abc","Pushkin, 6");
        InsuredPerson insuredPerson1=new InsuredPerson("Litvin", "Roman", "Mikhailovich", LocalDate.of(1998,6,10),100000,123456789);
        InsuredPerson insuredPerson2=new InsuredPerson("Milo", "Gaines",null,LocalDate.of(1968,3,27),20000,345678901);

        Contract contract=new Contract(LocalDate.of(2010,3,30),LocalDate.of(2010,3,31),LocalDate.of(2020,3,31),client,insuredPerson1,insuredPerson2);

        Assert.assertEquals(120000,contract.totalInsuranceCost());
    }
    @Test
    public void findByTaxIdentificationNumberTest(){
        Client client=new Client(Type.ENTITY,"abc","Pushkin, 6");
        InsuredPerson insuredPerson1=new InsuredPerson("Litvin", "Roman", "Mikhailovich", LocalDate.of(1998,6,10),100000,123456789);
        InsuredPerson insuredPerson2=new InsuredPerson("Milo", "Gaines",null,LocalDate.of(1968,3,27),20000,345678901);

        Contract contract=new Contract(LocalDate.of(2010,3,30),LocalDate.of(2010,3,31),LocalDate.of(2020,3,31),client,insuredPerson1,insuredPerson2);

        Assert.assertEquals(insuredPerson1,contract.findByTaxIdentificationNumber(123456789));
    }
}
