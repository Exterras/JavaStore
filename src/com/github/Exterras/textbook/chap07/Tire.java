package com.github.Exterras.textbook.chap07;

public class Tire {
	// field
	private int maxRotation;
	private int accumulatedRotation;
	private String location;
	
	// constructor
	public Tire(){
		
	}
	
	public Tire(String _loc, int _maxRot){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			/*System.out.println(location + "Tire Durability : "+
		    );*/
		return false;
		} else {
		return false;	
		}
		
	}
	
	
}
