package Consrate;

import Abstract.BaseCustomerService;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomer extends BaseCustomerService{
	
	private CustomerCheckService _customerCheckService;
	
	
	
    public StarbucksCustomer(CustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}



	@Override
    public void save(Customer customer) {
        if (_customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }else{
            throw new RuntimeException("Not a valid person!");
        }
    }
}
