package com.sty.domain;

public class MultiplicationImpl implements Multiplication {

	@Override
	public int mul(int firstVal, int secondVal) {
		int result = firstVal * secondVal;
		return result;
	}

	@Override
	public String mul(String firstVal, String secondVal) {
		//no code for this method
		return "string can perform only add operation remaining arithmetic operations are not performed(string doesn't allow operators) ";
	}

	@Override
	public float mul(float firstVal, float secondVal)  {
		float result = firstVal * secondVal;
		return result;
	
		
	}

	@Override
	public short mul(short firstVal, short secondVal) {
		short result = (short) (firstVal * secondVal);
		return result;
	}

	@Override
	public byte mul(byte firstVal, byte secondVal) {
		byte result = (byte) (firstVal * secondVal);
		return result;
	}

}
