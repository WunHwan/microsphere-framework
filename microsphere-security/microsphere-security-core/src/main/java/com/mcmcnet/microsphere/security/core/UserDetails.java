package com.mcmcnet.microsphere.security.core;

/**
 * todo...
 *
 * @author zhengwenhuan@gdmcmc.cn
 * @since todo...
 **/
public interface UserDetails {

    String getUsername();

    boolean accountNonBlocked();

    boolean accountNonExpired();

}
