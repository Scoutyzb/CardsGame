package com.github.scoutyzb.ddz;

import java.util.ArrayList;
import java.util.Collections;

public class GiveCards {
	public static ArrayList<Integer> giveCards(){
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<54;i++) {
			num.add(i);
			}
		Collections.shuffle(num);
		return num;
		
	}
}
