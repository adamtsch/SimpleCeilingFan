package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class DirectionNone implements FanDirectionState {

	CeilingFan ceilingFan;

	public DirectionNone(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void reverseDirection() {

		System.out.println("You cannot reverse the direction when the fan is Off");
		
	}
	
	@Override
	public String toString() {
		return "No Direction";
	}

}
