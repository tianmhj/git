package com.dzkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dzkj.mapper.usersmapper;
import com.dzkj.pojo.users;
@Service
public class usersimp implements usersdao {
@Autowired
private usersmapper umapper;
	@Override
	public List<users> all() {
		// TODO Auto-generated method stub
		
		return umapper.all();
	}
	@Override
	public int update(users u) {
		// TODO Auto-generated method stub
	
		return umapper.update(u);
		
	}
	@Override
	public users selectone(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("jfjfj");
		return umapper.selectone(id);
	}
	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		
		return umapper.remove(id);
	}

}
