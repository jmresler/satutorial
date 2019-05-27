package org.jmresler.sakila.auth;

import org.jmresler.sakila.db.UserRepository;
import org.jmresler.sakila.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	protected UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User currentUser = repository.findByUserName(username);
		UserDetails user = new org.springframework.security.core.userdetails.User(
				username, 
				currentUser.getPassword(),
				true, 
				true, 
				true, 
				true, 
				AuthorityUtils.createAuthorityList(currentUser.getRole()));
		return user;
	}

}