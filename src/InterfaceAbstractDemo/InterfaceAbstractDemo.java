package InterfaceAbstractDemo;

import java.util.Date;

import Abstract.BaseCustomerService;
import Adapter.MernisServiceAdapter;
import Consrate.CustomerCheckManager;
import Consrate.NeroCustomer;
import Consrate.StarbucksCustomer;
import Entities.Customer;

public class InterfaceAbstractDemo {

	public static void main(String[] args) {
		
        @SuppressWarnings("deprecation")
        Date enginDate = new Date(1985,1,6);
        @SuppressWarnings("deprecation")
        Date orhanDate = new Date(1999,8,25);
        @SuppressWarnings("deprecation")
        Date kursatDate = new Date(1999,8,31);

        BaseCustomerService customerManager1 = new StarbucksCustomer(new MernisServiceAdapter());
        customerManager1.save(new Customer(1, "Engin", "Demiroð", enginDate, "98765432194"));
        BaseCustomerService customerManager2 = new NeroCustomer();
        customerManager2.save(new Customer(2, "Orhan", "Ýnaç", orhanDate, "26075450526"));
        BaseCustomerService customerManager3 = new StarbucksCustomer(new CustomerCheckManager());
        customerManager3.save(new Customer(3, "Mustafa Kürþat", "KAya", kursatDate, "67867046824"));

	}

}
