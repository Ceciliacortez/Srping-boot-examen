package com.apirest.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Topicos  {
	
	
	 private int  id;
	 private  String nombre;
	 private List<String> topicos;  
     
	 
	 public Topicos(int id, String nombre) {
		 topicos = new ArrayList<>();
	        this.id = id;
	        this.nombre = nombre;
	    }
	 
     public void set(List<String> topicos) {  
          this.topicos = topicos;  
     }

	public List<String> getTopicos() {
		return topicos;
	}

	public void setTopicos(List<String> topicos) {
		this.topicos = topicos;
	}

	public void put(List<String> topicos2) {
		this.topicos = topicos2;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Topicos> findAll() {
		return findAll();
	}

	@Override
    public String toString() {
        return "Topicos{" + "id=" + id + ", nombre=" + nombre + 
                '}';
    }

}
