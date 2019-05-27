/**
 * 
 */
package org.jmresler.sakila.svc;

import org.jmresler.sakila.db.ActorRepository;
import org.jmresler.sakila.entities.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author John
 *
 */
@RestController
public class ActorController {
	
	@Autowired protected ActorRepository actorRep;
	
	@RequestMapping("/allactors")
	public Iterable<Actor> findAllActors() {
		return actorRep.findAll();
	}
}
