package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class SpeedTwo implements FanSpeedState {

	CeilingFan ceilingFan;

	public SpeedTwo(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void increaseSpeed() {

		System.out.println("Increasing Speed from Two to Three");
		ceilingFan.setCeilingFanSpeedState(ceilingFan.getSpeedThreeState());
	}

	@Override
	public String toString() {
		return "Speed Two";
	}
	
}
