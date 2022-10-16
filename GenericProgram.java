package com.blz.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericProgram {


	public int getMaxInteger(ArrayList<Integer> numberList) {
		Integer maxInt = 0;
		for (Integer integer : numberList) {
			if(integer.compareTo(maxInt) > 0) {
				maxInt=integer;
			}
		}
		
		return maxInt;
	}
	
	public float getMaxFloat(ArrayList<Float> floatList) {
		
		Float max = 0F;
		for (Float fNum : floatList) {
			if(fNum.compareTo(max) > 0) {
				max=fNum;
			}
		}
		
		return max;
		
	}
	
	public String getMaxString(ArrayList<String> stringList) {
		
		String maxStr = "";
		Integer len= 0;
		for (String str : stringList) {
			len = str.length();
			if(len.compareTo(maxStr.length()) > 0) {
				maxStr=str;
			}
		}
		
		return maxStr;
	}
	

}
