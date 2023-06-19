package com.techgeeknext.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("techgeeknext".equals(username)) {
			return new User("techgeeknext", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJPbmxpbmUgSldUIEJ1aWxkZX"
					+ "IiLCJpYXQiOjE2ODU4NjAwNTQsImV4cCI6MTcxNzM5NjA1NCwiYXVkIjoiIiwic3ViIjoiIiwiR"
					+ "2l2ZW5OYW1lIjoiVmFzYXZpIiwiU3VybmFtZSI6IkluZGlyYWxhIiwiRW1haWwiOiJpbmRpcmFsYXZhc2F"
					+ "2aTIyMkBleGFtcGxlLmNvbSIsIlJvbGUiOiJEZXZlbG9wZXIifQ.wVkSD-ItNrz8zyOF4PxilcYKsfrvLhQbKyRovpXBLdMś",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}