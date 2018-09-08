package com.qxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qxf.entity.Post;
import com.qxf.repository.PostRepository;


/**
 * 测试内嵌数据库，不需要提供数据库环境，方便快速
 * @author qiuxf
 *2017-11-29
 */
@Controller
public class AController {
	
	@Autowired
	private PostRepository post;
	
	@RequestMapping("/a")
	@ResponseBody
	public String a(){
		
		for (int i = 0; i < 5; i++) {
			Post p = new Post(""+ i,  "atest" + i);
			post.save(p);
		}
		
		
		Iterable<Post> l  = post.findAll();
		java.util.Iterator<Post> it = l.iterator();
		while(it.hasNext()){
			Post p1 = it.next();
			System.out.println(p1.toString());
		}
		
		return "success";
	}
}
