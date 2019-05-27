/**
 * 
 */
package org.jmresler.sakila.svc;

import org.jmresler.sakila.db.StoreRepository;
import org.jmresler.sakila.entities.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John
 *
 */
@RestController
public class StoreController {
	
	@Autowired protected StoreRepository storeRep;
	
	
	@RequestMapping("/allstores")
	public Iterable<Store> findAllStores() {
		return storeRep.findAll();
	}
}
