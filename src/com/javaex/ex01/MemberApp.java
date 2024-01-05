package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jung = new Member("jws","정우성",50000);
		Member yu = new Member("yjs","유재석",30000);
		Member lee = new Member("lhr","이효리",40000);
		
		jung.showInfo();
		yu.showInfo();
		lee.showInfo();
		
	}

}
