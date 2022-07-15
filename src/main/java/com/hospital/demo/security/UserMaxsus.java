package com.hospital.demo.security;

import com.hospital.demo.Entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserMaxsus implements UserDetails {
    private String username;
    private String password;
    private Set<GrantedAuthority> authority;
    private Boolean enabled;

    public UserMaxsus(){}

    public UserMaxsus(User user){
        this.username = user.getLogin();
        this.password = user.getParol();
        this.authority = new HashSet<>();
        this.authority.add(new SimpleGrantedAuthority(user.getRole().toString()));
        this.enabled = user.getAktiv();
    }





    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authority;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
        return enabled;
    }
}
