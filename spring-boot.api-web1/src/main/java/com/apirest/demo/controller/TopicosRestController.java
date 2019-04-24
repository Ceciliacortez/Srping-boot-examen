package com.apirest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.apirest.demo.model.Topicos;
import com.apirest.demo.service.TopicosIntService;

@Controller
public class TopicosRestController{
	 @Autowired
		private TopicosIntService topicosIntService;
	 @RequestMapping(value = "/topicos")
	    public List<Topicos> getTopicos() {
	        List<Topicos> topicos = topicosIntService.findAll();
	        return topicos;
	    }

}
