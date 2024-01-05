package com.javaex.ex04;

public class Base {
    
    public static void service(String state) {
    	if(state=="낮") {
        	Base.day();
         }else if(state=="밤") {
        	 Base.night();
         }else if(state=="오후") {
        	 Base.afternoon();
         }
    	
    	
        //코드작성할것
    }

    public static void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public static void night() {
        System.out.println("밤에는 숙면");
    	//코드작성할것
    }
    
    public static void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

