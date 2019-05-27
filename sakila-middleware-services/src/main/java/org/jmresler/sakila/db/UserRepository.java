/**
 * 
 */
package org.jmresler.sakila.db;


import org.jmresler.sakila.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author John
 *
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

	@RequestMapping("/users/findbyusername")
	User findByUserName(@Param("userName")String userName);
}
