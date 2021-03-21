/**
 * 
 */
package edu.fiu.roversansur;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ironman
 *
 */
public class Suspension implements SelfCheckCapable {
	String legs;
	String material;
	
	/**
	 * Puts suspension in Bogie Mode drive 
	 */
	void bogieMode() {
		
	}
	
	/**
	 * Makes rover move
	 * @return commands rover to run
	 */
	Body run() {
		return null;
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My Suspension";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.33);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
