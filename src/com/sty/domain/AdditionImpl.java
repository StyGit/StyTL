package com.sty.domain;

public class AdditionImpl implements Addition {

	@Override
	public int add(int firstVal, int secondVal) {
		
		
		return (firstVal+secondVal);
	}

	@Override
	public String add(String firstVal, String secondVal) {
		
		String result=firstVal+secondVal;
				
		return  result;
	}

	@Override
	public float add(float firstVal, float secondVal) {
		float result  = firstVal+secondVal;
		
		
		
		return result;
	}

	@Override
	public short add(short firstVal, short secondVal) {
		short result  = (short) ((firstVal)+  (secondVal));
		
		return result;
	}

}
