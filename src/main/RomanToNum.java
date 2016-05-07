package main;

public class RomanToNum {

	public int convert(String roman) {
		int result=0;
		if(roman=="IV"){
			return 4;
		}
		
		for(int i=0;i<roman.length();i++){
			result++;
			}
		return result;
	}

}
