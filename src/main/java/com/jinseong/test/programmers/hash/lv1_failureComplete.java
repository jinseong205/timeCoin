package com.jinseong.test.programmers.hash;

import java.util.ArrayList;

//fail 50/100
public class lv1_failureComplete {

	public static void main(String[] args) {
		String[] participant = {"kim","lee","jeong"};
		String[] completion = {"kim","lee"};
		
		lv1_failureComplete a = new lv1_failureComplete();
		System.out.println(a.solution(participant, completion));
	}
	
	public String solution(String[] participant, String[] completion) {
        
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : participant) {
			list.add(s);
		}
		for(String s: completion) {
			list.remove(s);
		}
		
		
		String answer = list.get(0);
        return answer;
    }
}
