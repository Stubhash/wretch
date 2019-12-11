package com.wretch.wretchmaven.service; 


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.wretch.wretchmaven.model.User;

import java.util.Collection;



public class SpringSecurityUser implements UserDetails {

    private final User user;


    private final Collection<? extends GrantedAuthority> authorities;


    public SpringSecurityUser(User user) {
        this.user = user;
        this.authorities = null;

       
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return authorities;
	}
}