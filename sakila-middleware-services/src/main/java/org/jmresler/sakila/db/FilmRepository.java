/**
 * 
 */
package org.jmresler.sakila.db;

import org.jmresler.sakila.entities.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author John
 *
 */
@RepositoryRestResource
public interface FilmRepository extends CrudRepository<Film, Long> {

}
