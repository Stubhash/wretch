package com.wretch.wretchmaven.service;

public interface SecurityService {
	String findLoggedInUsername();

    void autoLogin(String username, String password);
}
