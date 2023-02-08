package com.javabykiran.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links",catalog = "adminlte")
public class links {

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	private String Content;
	
	private String Click;
	
	public links() {
		// TODO Auto-generated constructor stub
	}

	public links(Integer id, String content, String click) {
		super();
		this.id = id;
		Content = content;
		Click = click;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getClick() {
		return Click;
	}

	public void setClick(String click) {
		Click = click;
	}
	
	
}
