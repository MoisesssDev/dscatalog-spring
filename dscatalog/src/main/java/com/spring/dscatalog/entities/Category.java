package com.spring.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	
	/**
	 * Constructor
	 * */
	public Category() {
		
	}

	public Category(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * Getters e Setters Id
	 * */

	public long getId() {
		return id;
	}
	

	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Getters e Setters name
	 * */

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Equals e HashCode
	 * */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}
