package com.cognizant.MovieCruiser.MovieCruizer;

import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.security.core.authority.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUser implements UserDetails {

private User user; // entity reference

private Collection<? extends GrantedAuthority> authorities; // to store role details


@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
return authorities;
}

@Override
public String getPassword() {
return user.getPassword();
}

@Override
public String getUsername() {
return null;

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
return true;
}

public AppUser(User user) {
this.user = user;
this.authorities = user.getRoleList().stream()
.map(role -> new SimpleGrantedAuthority(role.getRoName())).collect(Collectors.toList());

}

}
