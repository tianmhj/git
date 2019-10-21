package com.dzkj.mapper;

import java.util.List;

import com.dzkj.pojo.users;

public interface usersmapper {
	List<users> all();
	int update(users u);
	int remove(Integer id);
	users selectone(Integer id);
}
