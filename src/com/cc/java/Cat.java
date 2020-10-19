/**
 * @author Peter Schmidt
 *
 */

package com.cc.java;

public class Cat 
{
	// Fields
	public String name;
	public String furColor;
	public int age;
	public boolean isFemale;
	public int level;
	
	/**
	 * @param name
	 * @param furColor
	 * @param age
	 * @param isFemale
	 */
	public Cat(String name, String furColor, int age, boolean isFemale) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
		this.isFemale = isFemale;
	}

	public String tellYourAttributes(String flag) {
		switch (flag) 
		{	
			case "#name":
				return "Name: " + this.name;
			case "#color":
				return "Fellfarbe: " + this.furColor;
			case "#age": // Damen | Herren
				return this.checkCompliance();
			default:
				return "Something went wrong!";
		}	
	}
	
	public String checkCompliance() {
		if (!isFemale) {
			return "Alter: " + this.age;
		} else {
			return this.checkEscalationLevel();
		}
	}

	public String checkEscalationLevel() {
		
		// 1. --> "This is an inappropriate question!"
		// 2. --> "I've told you once!"
		// 3. --> "Talk to the hand!"
		
		this.level++;
		
		switch (this.level) {
		case 1:
			return "This is an inappropriate question!";		
		case 2:
			return "I've told you once!";		
		case 3:
			return "Talk to the hand!";
		default:
			return "shutdown!";
		}
		
	}
	
}
