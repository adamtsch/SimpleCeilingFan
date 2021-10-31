package ca.adam.ceilingfans.states;

import ca.adam.ceilingfans.CeilingFan;

public class SpeedOne implements FanSpeedState {

	CeilingFan ceilingFan;
	
	public SpeedOne(CeilingFan newCeilingFan) {
		ceilingFan = newCeilingFan;
	}

	@Override
	public void increaseSpeed() {

		System.out.println("Increasing Speed from One to Two");
		ceilingFan.setCeilingFanSpeedState(ceilingFan.getSpeedTwoState());
	}

	@Override
	public String toString() {
		return "Speed One";
	}
	

}
