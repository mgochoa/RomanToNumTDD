package main;
import java.util.HashMap;
import java.util.Map;
public class RomanToNum {
	public int convert(String roman) {
		
		
		int result=0;
		char actual;
		int previousNum = 0;
		int currentNum = 0;
		for(int i=roman.length()-1;i>=0;i--){
			actual = roman.charAt(i);
			currentNum = map_Num_Rom.get(actual);

			if (previousNum <= currentNum) {
				result += currentNum;
			} else {
				result -= currentNum;
				
				
			}
			previousNum = currentNum;
		}

		/*
		if(roman=="VI"){
			result=6;
		}else if(roman=="V"){
			result=5;
		}else if(roman=="IV"){
			result= 4;
		}else{
		
		for(int i=0;i<roman.length();i++){
			result++;
			}
		}*/	
		return result;
	}
	private static final Map<Character, Integer> map_Num_Rom = new HashMap<>();
	static {
		map_Num_Rom.put('I', 1);
		map_Num_Rom.put('V', 5);
		map_Num_Rom.put('X', 10);
		map_Num_Rom.put('L', 50);
		map_Num_Rom.put('C', 100);
		map_Num_Rom.put('D', 500);
		map_Num_Rom.put('M', 1000);
	}



}
