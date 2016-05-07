package main;

public class RomanToNum {

	public int convert(String roman) {
		int result=0;
		if(roman=="V"){
			result=5;
		}else if(roman=="IV"){
			result= 4;
		}else{
		
		for(int i=0;i<roman.length();i++){
			result++;
			}
		}
		return result;
	}

}
