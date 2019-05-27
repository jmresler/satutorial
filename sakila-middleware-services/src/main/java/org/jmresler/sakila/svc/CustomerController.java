/**
 * 
 */
package org.jmresler.sakila.svc;

import org.jmresler.sakila.db.CustomerRepository;
import org.jmresler.sakila.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John
 *
 */
@RestController
public class CustomerController {
	
	@Autowired protected CustomerRepository customerRep;
	
	@RequestMapping("/allcustomers")
	public Iterable<Customer> findAllCustomers() {
		return customerRep.findAll();
	}

}
