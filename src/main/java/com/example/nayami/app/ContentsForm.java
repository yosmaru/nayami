package com.example.nayami.app;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContentsForm {

	@Size(min = 1, max = 200, message = "1文字以上200文字以下で入力してください")
	@NotNull
	private String content;
	@Size(min = 1, max = 200, message = "1文字以上200文字以下で入力してください")
	private String cause;
	private String category;
	private String desire;
	private String fSelectCategory;
	private String fSelectDesire;

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

	public String getfSelectCategory() {
		return fSelectCategory;
	}

	public void setfSelectCategory(String fSelectCategory) {
		this.fSelectCategory = fSelectCategory;
	}

	public String getfSelectDesire() {
		return fSelectDesire;
	}

	public void setfSelectDesire(String fSelectDesire) {
		this.fSelectDesire = fSelectDesire;
	}
}
