/**
 * 
 */
package ETPhoneHome;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ironman
 *
 */
public class Body implements SelfCheckCapable {
	HighGainAnt myant;
	Computer mycomputer;
	Mast mymast;
	MastcamZ mymastcamz;
	
		public Body() {
		myant = new HighGainAnt();
		mycomputer = new Computer();
		mymast = new Mast();
		mymastcamz = new MastcamZ();
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Body";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myant, mycomputer,mymast, mymastcamz);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Body myBody = new Body();
		myBody.runSelfCheck();
		myBody.receive();
	}
	private void receive() {
		// TODO Auto-generated method stub
		myant.receive();
	}

}
