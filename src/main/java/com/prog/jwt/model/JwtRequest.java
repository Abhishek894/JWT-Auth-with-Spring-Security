package com.prog.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {

	private String username;
	private String password;
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
