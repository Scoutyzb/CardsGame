package com.github.scoutyzb.ddz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cards{
	private Map<Integer,String> cards=new HashMap<Integer, String>();
	public ArrayList<String> getCards(Players p){
		p.sortCard();
		ArrayList<String> list = new ArrayList<String>();
		for(int i :p.getCardindex()){
			list.add(cards.get(i));
		}
		return list;
	}
	public Cards() {
		super();
		// TODO Auto-generated constructor stub
		cards.put(0, "Joker Red");
		cards.put(1, "Joker Black");
		int i=2;
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		String[] colors = {"B","R","F","S"};
		for(String num:numbers) {
			for (String col:colors) {
				cards.put(i,col+num);
				i++;
			}
		}
	}
	
}
