package com.zhangguo.springmvc71.entities;

/**
 * 文章
 *
 */
public class Article {
	/*
	 * 编号
	 */
	private int id;
	/*
	 * 标题
	 */
	private String title;
	/*
	 * 内容
	 */
	private String content;

	public Article() {
	}

	public Article(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
