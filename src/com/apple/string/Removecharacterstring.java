package com.apple.string;

public class Removecharacterstring {

	    public static String removeChr(String str, char x){
	        StringBuilder strBuilder = new StringBuilder();
	        char[] rmString = str.toCharArray();
	        for(int i=0; i<rmString.length; i++){
	            if(rmString[i] !=x){
	                strBuilder.append(rmString[i]);
	            }
	        }
	        return strBuilder.toString();
	    }
	}


