package edu.fiu.pagen20;

public class Notification {

	private int Alerts;
	private int UnitsofMeasurements;
	private int Volumecontrol;

	public void volumeup() {}

	public void volumedown() {}

	public void alertson() {}

	public void alertsoff() {}

	/**
	 * @return the alerts
	 */
	public int getAlerts() {
		return Alerts;
	}

	/**
	 * @param alerts the alerts to set
	 */
	public void setAlerts(int alerts) {
		Alerts = alerts;
	}

	/**
	 * @return the unitsofMeasurements
	 */
	public int getUnitsofMeasurements() {
		return UnitsofMeasurements;
	}

	/**
	 * @param unitsofMeasurements the unitsofMeasurements to set
	 */
	public void setUnitsofMeasurements(int unitsofMeasurements) {
		UnitsofMeasurements = unitsofMeasurements;
	}

	/**
	 * @return the volumecontrol
	 */
	public int getVolumecontrol() {
		return Volumecontrol;
	}

	/**
	 * @param volumecontrol the volumecontrol to set
	 */
	public void setVolumecontrol(int volumecontrol) {
		Volumecontrol = volumecontrol;
	}

}