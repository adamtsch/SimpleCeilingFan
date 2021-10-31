package ca.adam.ceilingfans.states;

/**
 * State interface for encapsulating the 
 * behavior associated with the Direction State
 * @author adamtsch
 */
public interface FanDirectionState {

	/**
	 * Method to invoke the logic of changing
	 * the fans direction while it is on
	 */
	void reverseDirection();
	
}
