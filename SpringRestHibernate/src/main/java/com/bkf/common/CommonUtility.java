package com.bkf.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CommonUtility {

	private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public static String encodePassword(String password) {
		return passwordEncoder.encode(password);
	}

}
