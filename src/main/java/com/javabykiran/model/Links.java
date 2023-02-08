package com.javabykiran.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links",catalog = "adminlte")
public class Links {

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	private String content;
	
	private String click;
	
	public Links() {
		// TODO Auto-generated constructor stub
	}

	public Links(Integer id, String content, String click) {
		super();
		this.id = id;
		this.content = content;
		this.click = click;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getClick() {
		return click;
	}

	public void setClick(String click) {
		this.click = click;
	}
	
	
}
