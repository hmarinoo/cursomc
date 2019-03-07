package com.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String Name;
	
	private List<?> produtos = new ArrayList<>();

	public Categoria() {

	}

	public Categoria(Integer id, String name) {
		this.id = id;
		Name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", Name=" + Name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
