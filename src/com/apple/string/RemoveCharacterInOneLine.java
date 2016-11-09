package com.apple.string;

public class RemoveCharacterInOneLine {
	
	public String  removEcharInALine(String input, String toBeReplaced, String toReplace){
		String output="";
		if(null!=input){
			output=  input.replaceAll(toBeReplaced,toReplace);
		}
        return output;

	}
}