package com.github.scoutyzb.ddz;

import java.util.ArrayList;

public class CardsMain {
	public static void main(String[] args) {
		Cards cards = new Cards();
		Players p1 = new Players("LiHua");
		Players p2 = new Players("HanMeimei");
		Players p3 = new Players("XiaoSan");
		Players bottom = new Players("Bottom");
		ArrayList<Integer> num=GiveCards.giveCards();
		for(int i=0;i<num.size();i++) {
			if(i<3) {
				bottom.setCard(num.get(i));
			}
			else {
				p1.setCard(num.get(i));
				p2.setCard(num.get(++i));
				p3.setCard(num.get(++i));
			}
		}
		System.out.println(cards.getCards(p1));
		System.out.println(cards.getCards(p2));
		System.out.println(cards.getCards(p3));
		System.out.println(cards.getCards(bottom));
	}
}
