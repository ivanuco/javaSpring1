package com.example.demo;

import java.util.List;
import java.util.Map;

public class Fruit {

	private List<String> fruitNameList;

	private Map<String, String> fruitNameMap;

	public Fruit() {
	}

	public String talkMeAboutYourself() {
		String speech = "Soy una fruta";

		if (fruitNameList != null && fruitNameList.size() > 0) {
			speech += ". \nList:  ";
			for (int i = 0; i < fruitNameList.size(); i++) {
				speech += ". name: " + fruitNameList.get(i);
			}
		}

		if (fruitNameMap != null && fruitNameMap.size() > 0) {
			speech += "\nMap: ";
			for (Map.Entry<String, String> fruitName : fruitNameMap.entrySet()) {
				speech += fruitName.getKey() + " ==> " + fruitName.getValue() + " :: ";
			}
		}
		return speech;
	}

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

}
