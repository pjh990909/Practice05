package com.javaex.ex10;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;
	private String rental = "재고있음";

	public Book() {

	}

	public Book(int bookNo, String title, String auther) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = auther;
	}

	public Book(int bookNo, String title, String author, String rental, int stateCode) {
		this(bookNo, title, author);
		this.stateCode = stateCode;
		this.rental = rental;
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

		if (stateCode > -1 && stateCode < 2) {
			if (stateCode == 0) {
				this.rental = "대여중";
			} else if(stateCode == 1){
				this.rental = "재고있음";
			}
		}
		this.stateCode = stateCode;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", auther=" + author + ", stateCode=" + rental + "]";
	}

	public void rent() {
			System.out.println(title + "이(가) 대여 됐습니다.");
	}

	public void print() {
		System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + rental);

	}

}