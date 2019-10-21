package com.dzkj.service;

import java.util.List;

import com.dzkj.pojo.users;

public interface usersdao {
	List<users> all();
	int update(users u);
	int remove(Integer id);
	users selectone(Integer id);
}
