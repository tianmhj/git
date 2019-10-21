package com.dzkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj.pojo.users;
import com.dzkj.service.usersimp;

@Controller
public class a {
	@Autowired
	private usersimp imp;
	@RequestMapping("all")
	public String cha(Model mod) {
		List<users> list = imp.all();
		mod.addAttribute("list", list);
		return "index.html";
		
		
	}
	@RequestMapping("selectone")
	public String chaone(Model mod,int id) {
		System.out.println(id);
		users users = imp.selectone(id);
		System.out.println("测试");
		 mod.addAttribute("u", users);
	
		
		return "update.html";
		
		
	

}
	@RequestMapping("update")
	public String gai(String name,users u) {
		System.out.println(u);
	
	    int i = imp.update(u);
	    System.out.println(i);
	
		
		return "false.html";
		
		

		

}
	@RequestMapping("remove")
	public String shan(Integer id) {
		
	
	    int i = imp.remove(id);
	
	
		
		return "forward:all";
		
		

		

}
}