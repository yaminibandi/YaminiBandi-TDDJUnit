package com.epam.tddjunitassignment;

public class SwapChars {

	public String modify(String string) {
		// TODO Auto-generated method stub
		String result="";
		for(int i=0;i<string.length();i++) {
			if(i<2) {
				if(string.charAt(i)!='A') {
					result+=string.charAt(i);
				}
			}
			else {
				result+=string.charAt(i);
			}
		}
		return result;
	}

}
