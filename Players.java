package com.github.scoutyzb.ddz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Players {
	private String name;
	private List<Integer> cardindex = new ArrayList<Integer>();
	public Players(String name) {
		this.name=name;
	}
	public void setCard(int num) {
		cardindex.add(num);
	}
	public void sortCard() {
		Collections.sort(cardindex);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getCardindex() {
		return cardindex;
	}
}
