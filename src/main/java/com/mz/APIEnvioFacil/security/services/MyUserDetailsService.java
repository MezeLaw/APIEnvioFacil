package com.mz.APIEnvioFacil.security.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface MyUserDetailsService extends UserDetailsService {
	
	UserDetails loadByEmail(String email) throws Exception;
	/** El metodo anterior, era al pedo porque para hacer el auth, Spring utiliza el metodo siguiente. Solamente tuve que 
	 *  sobrecargar el del UserRepository **/
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
