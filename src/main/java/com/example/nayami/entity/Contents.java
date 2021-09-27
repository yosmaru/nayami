package com.example.nayami.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class Contents {

	public Contents () {
		
	}
	
	private int id;
	@NotNull
	private String content;
	private String cause;
	private String category;
	private String desire;
	private LocalDateTime created;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesire() {
		return desire;
	}
	public void setDesire(String desire) {
		this.desire = desire;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}


}
