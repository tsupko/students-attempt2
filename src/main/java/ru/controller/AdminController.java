package ru.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
@Controller
public class AdminController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @SuppressWarnings("unchecked")
    public String admin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Set<GrantedAuthority> set = (Set<GrantedAuthority>) userDetails.getAuthorities();
        return set.contains(new SimpleGrantedAuthority("ROLE_ADMIN")) ? "admin" : "welcome";
    }
}
