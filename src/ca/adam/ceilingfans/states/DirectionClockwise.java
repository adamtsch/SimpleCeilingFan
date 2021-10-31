package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class DirectionClockwise implements FanDirectionState {

	CeilingFan ceilingFan;

	public DirectionClockwise(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void reverseDirection() {

		System.out.println("Reversing Fan Direction to Counter Clockwise");
		ceilingFan.setCeilingFanDirectionState(ceilingFan.getDirectionCounterClockwiseState());
	}

	@Override
	public String toString() {
		return "Clockwise Direction";
	}
	
}
