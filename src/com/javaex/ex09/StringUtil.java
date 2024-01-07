package com.javaex.ex09;

public class StringUtil {
    
        //메소드 내용작성
        public static String concatString(String[] hero) {
        	String no="";
        	for(int i=0;i<hero.length;i++) {
        		no= no+hero[i];
        	}
        	return no;
        }
    

}
