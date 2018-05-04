package com.example.demo;

public class Vegetable {
	private String myName;

	public Vegetable() {

	}

	public Vegetable(String pname) {
		myName = pname;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkMeAboutYourself() {
		String speech = "Soy un vegetal";
		if (myName != null && myName != "") {
			speech = speech + " My name is: " + myName;
		}
		return speech;
	}

	public void initMethod() {
		System.out.println("The vegetable is ready to go." + this.myName);
	}

	public void destroyMethod() {
		System.out.println("The vegetable is about to be destroyed." + this.myName);
	}
}
