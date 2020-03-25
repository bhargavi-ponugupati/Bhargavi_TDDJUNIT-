package com.epam.Remove2A;

public class Remove2_A {

	public String remove1(String s) {
		String rstring=s;
		if(s.length()==0) {
			rstring=" ";
		}
		else if(s.length()==1){
		if (s.charAt(0)=='A') {
			rstring=" ";
		}
		else {
			rstring=s;
		}
		}
		else {
			if(s.charAt(0)=='A') {
				if(s.charAt(1)=='A') {
					rstring=s.substring(2);
				}
				else {
					rstring=s.substring(1);
				}
			}
			else {
				if(s.charAt(1)=='A') {
					rstring=s.charAt(0)+s.substring(2);
				}
			}
		}
		
		return rstring;
	}

}
