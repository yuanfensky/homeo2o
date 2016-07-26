package com.wsjia.ms.utils;

public class StringUtil {

	public static String removeChar(String str,char c){
		String[] strs = str.split("-");
		String newStr = "";
		for(String s:strs){
			newStr+=s;
		}
		return newStr;
	}
}
