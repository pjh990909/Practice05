package com.javaex.ex10;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book() {

	}

	public Book(int bookNo, String title, String auther) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = auther;
	}

	public Book(int bookNo, String title, String author, int stateCode) {
		this(bookNo, title, author);
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuther(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", auther=" + author + ", stateCode=" + stateCode + "]";
	}

	public void rent() {

	}

	public void print() {

	}

}