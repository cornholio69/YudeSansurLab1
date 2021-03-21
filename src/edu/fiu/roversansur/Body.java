/**
 * 
 */
package edu.fiu.roversansur;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author ironman
 *
 */
public class Body implements SelfCheckCapable {

	int weight;
	int length;
	int height;
	int width;
	
	/**
	 * returns the bodies measurements
	 */
	void run() {
		
	}
	
	/**
	 * sets rovers body in automode
	 */
	void automode(){
		
	}
	
	/**
	 * Commands movement of body
	 */
	void movement() {
		
	}
	
	/**
	 * Elevates body as needed
	 */
	void elevate() {
		
	}
	/**
	 * Stops body movement
	 */
	void stop() {
		
	}
	
	/**
	 * Turn rovers body
	 */
	void turn() {
		
	}
	/**
	 *Sends command for a needed reacharge
	 */
	void recharge() {
		
	}
	
	/**
	 * Send data to specific antenna to trasnmit back to Earth
	 */
	void communicate() {
		
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
