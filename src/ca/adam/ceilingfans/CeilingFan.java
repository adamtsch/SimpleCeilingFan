package ca.adam.ceilingfans;

import ca.adam.ceilingfans.states.DirectionClockwise;
import ca.adam.ceilingfans.states.DirectionCounterClockwise;
import ca.adam.ceilingfans.states.DirectionNone;
import ca.adam.ceilingfans.states.FanDirectionState;
import ca.adam.ceilingfans.states.FanSpeedState;
import ca.adam.ceilingfans.states.IsOff;
import ca.adam.ceilingfans.states.SpeedOne;
import ca.adam.ceilingfans.states.SpeedThree;
import ca.adam.ceilingfans.states.SpeedTwo;

/**
 * 
 * The Context class of the Ceiling Fan.
 * 
 * This class maintains an instance of the ConcereteState
 * subclass that defines the current state
 *
 * @author adamtsch
 *
 */
public class CeilingFan {

	FanDirectionState directionNone;
	FanDirectionState directionClockwise;
	FanDirectionState directionCounterClockwise;
	FanSpeedState isOff;
	FanSpeedState speedOne;
	FanSpeedState speedTwo;
	FanSpeedState speedThree;
	
	FanSpeedState fanSpeedState;
	FanDirectionState fanDirectionState;
	
	public CeilingFan() {
		
		// Initialize States
		directionClockwise = new DirectionClockwise(this);
		directionCounterClockwise = new DirectionCounterClockwise(this);
		directionNone = new DirectionNone(this);
		isOff = new IsOff(this);
		speedOne = new SpeedOne(this);
		speedTwo = new SpeedTwo(this);
		speedThree = new SpeedThree(this);
		
		// Set Initial States of Ceiling Fan
		fanSpeedState = getIsOffState();
		fanDirectionState = getDirectionNone();
	}
	
	public void setCeilingFanSpeedState(FanSpeedState newState) {
		this.fanSpeedState = newState;
	}
	
	public void setCeilingFanDirectionState(FanDirectionState newState) {
		this.fanDirectionState = newState;
	}
	
	
	/**
	 * Calls the increaseSpeed method
	 * on the current Fan Speed State
	 */
	public void increaseSpeed() {
		fanSpeedState.increaseSpeed();
	}
	
	
	/**
	 * Calls the reverseDirection method
	 * on the current Fan Direction State
	 */
	public void reverseDirection() {
		fanDirectionState.reverseDirection();
	}
	
	
	public FanSpeedState getCurrentFanSpeed() {
		return fanSpeedState;
	}
	
	public FanDirectionState getCurrentFanDirection() {
		return fanDirectionState;
	}
	
	// Methods to return the initialized States of the Ceiling Fan
	public FanDirectionState getDirectionCounterClockwiseState() { return directionCounterClockwise; }
	public FanDirectionState getDirectionClockWiseState() { return directionClockwise; }
	public FanDirectionState getDirectionNone() { return directionNone; }
	public FanSpeedState getIsOffState() { return isOff; }
	public FanSpeedState getSpeedOneState() { return speedOne; }
	public FanSpeedState getSpeedTwoState() { return speedTwo; }
	public FanSpeedState getSpeedThreeState() { return speedThree; }
	
	
}
