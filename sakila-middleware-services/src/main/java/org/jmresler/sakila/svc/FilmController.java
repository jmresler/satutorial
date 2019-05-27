/**
 * 
 */
package org.jmresler.sakila.svc;

import org.jmresler.sakila.db.FilmRepository;
import org.jmresler.sakila.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John
 *
 */
@RestController
public class FilmController {
	
	@Autowired protected FilmRepository filmRep;
	
	@RequestMapping("/allfilms")
	public Iterable<Film> findAllFilms() {
		return filmRep.findAll();
	}

}
