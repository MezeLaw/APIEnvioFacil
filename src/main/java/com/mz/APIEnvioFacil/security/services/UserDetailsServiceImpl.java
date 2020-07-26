package com.mz.APIEnvioFacil.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mz.APIEnvioFacil.model.User;
import com.mz.APIEnvioFacil.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements MyUserDetailsService {

	@Autowired
	UserRepository userRepository;

	/**
	 * Este metodo nunca se usa, pero no lo borro hasta que sepa que no afectara en
	 * nada.
	 **/
	@Override
	public UserDetails loadByEmail(String email) throws Exception {

//		try {
//			User user = userRepository.findByEmail(email);
//			return UserDetailsImpl.build(user);
//		} catch (Exception e) {
//			throw new Exception("No existe usuario para el email: " + email);
//		}
////				.orElseThrow(() -> new Exception("User Not Found with email: " + email));
		return null;

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByEmail(username);
		return UserDetailsImpl.build(user);

	}

}
