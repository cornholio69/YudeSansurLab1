package edu.fiu.pagen20;

public class EMRRecords extends PageNApp {

	private int Patient;
	private int EMRRecords;
	private int Location;

	public void sendrecord() {
		}

	public int getPatient() {
		return Patient;
	}

	public void setPatient(int patient) {
		Patient = patient;
	}

	public int getEMRRecords() {
		return EMRRecords;
	}

	public void setEMRRecords(int eMRRecords) {
		EMRRecords = eMRRecords;
	}

	public int getLocation() {
		return Location;
	}

	public void setLocation(int location) {
		Location = location;
	}

}