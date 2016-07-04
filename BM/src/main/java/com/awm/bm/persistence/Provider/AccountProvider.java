package com.awm.bm.persistence.Provider;

import java.util.Map;

import com.awm.bm.model.Account;

public class AccountProvider {
	public String modifyUser(Map<String, Object> parameters) {
		Account account = (Account) parameters.get("account");
		
		return null;
	}

	public String findUser() {
		return null;
	}

	public String findUsers() {
		return null;
	}
}
