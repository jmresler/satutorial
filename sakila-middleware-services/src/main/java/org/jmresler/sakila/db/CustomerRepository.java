/**
 * 
 */
package org.jmresler.sakila.db;

import org.jmresler.sakila.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author John
 *
 */
@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
