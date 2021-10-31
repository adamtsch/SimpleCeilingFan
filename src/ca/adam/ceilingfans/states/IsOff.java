package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class IsOff implements FanSpeedState {

	CeilingFan ceilingFan;
	
	public IsOff(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void increaseSpeed() {

		ceilingFan.setCeilingFanSpeedState(ceilingFan.getSpeedOneState());
		ceilingFan.setCeilingFanDirectionState(ceilingFan.getDirectionClockWiseState());
		System.out.println("Turning On Fan. Speed is One. Direction is Clockwise");
		
		
	}

	@Override
	public String toString() {
		return "Off";
	}
	
}
