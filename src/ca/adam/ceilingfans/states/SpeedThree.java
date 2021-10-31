package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class SpeedThree implements FanSpeedState {

	CeilingFan ceilingFan;

	public SpeedThree(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void increaseSpeed() {

		System.out.println("Turning Fan off");
		ceilingFan.setCeilingFanSpeedState(ceilingFan.getIsOffState());
		ceilingFan.setCeilingFanDirectionState(ceilingFan.getDirectionNone());
	}
	
	@Override
	public String toString() {
		return "Speed Three";
	}

}
