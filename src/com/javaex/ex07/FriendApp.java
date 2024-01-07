package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        String name;
        String hp;
        String school;
        
        Friend jung = new Friend();
        Friend lee = new Friend();
        Friend yu = new Friend();
        friendArray[0]=jung;
        friendArray[1]=lee;
        friendArray[2]=yu;
        
        System.out.println("친구를 3명 등록해 주세요");
        
        //for문 시작
        for(int i=0;i<friendArray.length;i++) {
        	System.out.print("이름:");
        	name = sc.nextLine();
        	friendArray[i].setName(name);
        	System.out.print("핸드폰:");
        	hp = sc.nextLine();
        	friendArray[i].setHp(hp);
        	System.out.print("학교:");
        	school = sc.nextLine();
        	friendArray[i].setSchool(school);
        	System.out.println("----------------------------");
        }
        //친구정보 3명 입력 로직 --> 반복문 사용
        
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
