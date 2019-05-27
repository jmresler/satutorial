package org.jmresler.sakila.svc;

import javax.jws.WebParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchService {

	@RequestMapping(name = "/search")
	public Iterable<String> search(@WebParam(name = "terms") String[] terms) {
		
		return null;
		
	}
}
