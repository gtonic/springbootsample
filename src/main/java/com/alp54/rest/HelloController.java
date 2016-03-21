package com.alp54.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alp54.data.HelloRepository;
import com.alp54.domain.Hello;

@Controller
public class HelloController {
	
	@Autowired
	private HelloRepository repo;
    
    private static long id = 0;

    @RequestMapping(path="/hello", method=RequestMethod.GET)
    public @ResponseBody Hello getHello(@RequestParam(value="message", required=false, defaultValue="Eins") String message) {
        
    	if (!repo.exists(1L)) {
    		repo.save(new Hello(1, "Eins"));
    		repo.save(new Hello(2, "Zwei"));
    	}
    	List<Hello> objects = repo.findByMessage(message);    	
    	if (objects.size() > 0) {
    		return objects.get(0);
    	}
    	return null;
    }

}