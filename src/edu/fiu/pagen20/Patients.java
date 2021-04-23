package edu.fiu.pagen20;

public class Patients {

	private int Name;
	private int Location;
	private int Nurseassigned;
	private int diagnosis;
	private int attendingprovider;

	public void Ordersplaced() {}

	public void locationassigned() {}

	public void nurseassigned() {}

	public void statusupdated() {}

	/**
	 * @return the name
	 */
	public int getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		Name = name;
	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return Location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(int location) {
		Location = location;
	}

	/**
	 * @return the nurseassigned
	 */
	public int getNurseassigned() {
		return Nurseassigned;
	}

	/**
	 * @param nurseassigned the nurseassigned to set
	 */
	public void setNurseassigned(int nurseassigned) {
		Nurseassigned = nurseassigned;
	}

	/**
	 * @return the diagnosis
	 */
	public int getDiagnosis() {
		return diagnosis;
	}

	/**
	 * @param diagnosis the diagnosis to set
	 */
	public void setDiagnosis(int diagnosis) {
		this.diagnosis = diagnosis;
	}

	/**
	 * @return the attendingprovider
	 */
	public int getAttendingprovider() {
		return attendingprovider;
	}

	/**
	 * @param attendingprovider the attendingprovider to set
	 */
	public void setAttendingprovider(int attendingprovider) {
		this.attendingprovider = attendingprovider;
	}

}