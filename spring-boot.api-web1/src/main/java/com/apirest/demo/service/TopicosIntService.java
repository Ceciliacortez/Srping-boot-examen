package com.apirest.demo.service;

import java.io.Serializable;
import java.util.List;

import com.apirest.demo.model.Topicos;

public interface TopicosIntService  extends Serializable {
	
	 public abstract void createTopicos(Topicos topicos);
	   public List<Topicos> findAll();
}
	