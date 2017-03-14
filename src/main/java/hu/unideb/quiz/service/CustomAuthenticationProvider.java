package hu.unideb.quiz.service;

import hu.unideb.quiz.persistence.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;


import java.util.Collection;
import java.util.Collections;

@Component("customAuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider {


    @Autowired
    UserService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        Collection<GrantedAuthority> authorities = null;

        User userFromDB = userService.getUserByUsernameAndPassword(name, password);

        if(userFromDB != null && "12345".equals(userFromDB.getPassWord())) {
           authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        }
        if(userFromDB != null && "admin".equals(userFromDB.getPassWord())) {
            authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        System.out.println(name + " " + password + " " + authorities);
        System.out.println("AUTHORITIES: " + authorities);

        return new UsernamePasswordAuthenticationToken(name, password, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
