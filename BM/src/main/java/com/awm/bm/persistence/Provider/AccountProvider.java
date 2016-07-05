package com.awm.bm.persistence.Provider;

import java.util.Map;

import com.awm.bm.model.Account;

public class AccountProvider {
	public String modifyUser(Map<String, Account> parameters) {
		Account account = parameters.get("account");
		String sql = "update account ";
		if (!account.getName().isEmpty()) {
			sql += "set name=" + account.getName() + " ";
		}
		if (!account.getPassword().isEmpty()) {
			sql += "set password=" + account.getPassword() + " ";
		}
		if (!account.getPhone().isEmpty()) {
			sql += "set phone=" + account.getPhone() + " ";
		}
		if (!account.getId_card().isEmpty()) {
			sql += "set id_card=" + account.getId_card() + " ";
		}
		sql += "set level=" + account.getLevel() + " ";
		sql += "set state=" + account.getState() + " ";
		sql += "set store=" + account.getStore() + " ";
		sql += "where id=" + account.getId();
		return sql;
	}
}
