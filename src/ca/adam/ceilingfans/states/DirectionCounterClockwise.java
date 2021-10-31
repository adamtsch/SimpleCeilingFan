package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class DirectionCounterClockwise implements FanDirectionState {

	CeilingFan ceilingFan;

	public DirectionCounterClockwise(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void reverseDirection() {

		System.out.println("Reversing Fan Direction to Clockwise");
		ceilingFan.setCeilingFanDirectionState(ceilingFan.getDirectionClockWiseState());
		
	}
	
	@Override
	public String toString() {
		return "Counter Clockwise Direction";
	}

}
