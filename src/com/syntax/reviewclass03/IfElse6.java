package com.syntax.reviewclass03;

public class IfElse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country="India";
		String capital;
		
		switch(country) {
		
		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Begrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case  "Afghanistan":
			capital="Kabul";
			break;
		case "Pakistan":
			capital="Ismabad";
			break;
		default:
			capital="Either country name is not correct or its not a country";
		}
		System.out.println(capital);
	}

}


