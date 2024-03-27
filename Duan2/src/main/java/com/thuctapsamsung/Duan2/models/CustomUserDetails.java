/**
 * 
 */
package com.thuctapsamsung.Duan2.models;
/*khong nguyen ban*/
import java.util.Collection;

import com.thuctapsamsung.Duan2.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * 
 */
public class CustomUserDetails implements UserDetails {

	private User user;
	private Collection<? extends GrantedAuthority> authorities;

	public CustomUserDetails() {
		// TODO Auto-generated constructor stub
	}

	

	public CustomUserDetails(User user,Collection<? extends GrantedAuthority> authorities) {
		super();
		this.user = user;
		this.authorities = authorities;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassWord();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
