package edu.fiu.pagen20;

public class Messageinbox {

	private int incomingmessages;
	private int sentmessages;
	private int status;
	@SuppressWarnings("unused")
	private int timestamp;

	public void Messagecount() {}

	public void displayinbox() {}

	/**
	 * @return the incomingmessages
	 */
	public int getIncomingmessages() {
		return incomingmessages;
	}

	/**
	 * @param incomingmessages the incomingmessages to set
	 */
	public void setIncomingmessages(int incomingmessages) {
		this.incomingmessages = incomingmessages;
	}

	/**
	 * @return the sentmessages
	 */
	public int getSentmessages() {
		return sentmessages;
	}

	/**
	 * @param sentmessages the sentmessages to set
	 */
	public void setSentmessages(int sentmessages) {
		this.sentmessages = sentmessages;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}