package edu.fiu.pagen20;

public class Nurses extends Users {

	private int Name;
	private int Speciality;
	private int Unit;
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
	 * @return the speciality
	 */
	public int getSpeciality() {
		return Speciality;
	}
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(int speciality) {
		Speciality = speciality;
	}
	/**
	 * @return the unit
	 */
	public int getUnit() {
		return Unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(int unit) {
		Unit = unit;
	}

}