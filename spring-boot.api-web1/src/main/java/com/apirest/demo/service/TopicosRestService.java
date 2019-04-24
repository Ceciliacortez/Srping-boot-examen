package com.apirest.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.apirest.demo.model.*;

public abstract  class TopicosRestService implements TopicosIntService {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public List<Topicos> findAll() {

        List<Topicos> topicos = new ArrayList<>();
        
        topicos.add(new Topicos(1,"Topico 1"));
        topicos.add(new Topicos(2, "Topico 2"));
        topicos.add(new Topicos(3, "Topico 3"));
        return topicos;
    }
			
}			
