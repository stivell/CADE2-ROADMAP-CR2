package com.itpe.springbatch.model;

import org.joda.time.LocalDate;

public class TaxpayerModel {

	private int recordID;
	private String nameControl;
	private String taxpayerSSN;
	private String taxpayerType;
	private String taxpayerMisc;
	private LocalDate taxPeriod;
	private String taxpayerCrossRefSSN;
	private LocalDate mftDate;
	/**
	 * @return the recordID
	 */
	public int getRecordID() {
		return recordID;
	}
	/**
	 * @param recordID the recordID to set
	 */
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	/**
	 * @return the name_control
	 */
	public String getNameControl() {
		return nameControl;
	}
	/**
	 * @param name_control the name_control to set
	 */
	public void setNameControl(String name_control) {
		this.nameControl = name_control;
	}
	/**
	 * @return the taxpayerSSN
	 */
	public String getTaxpayerSSN() {
		return taxpayerSSN;
	}
	/**
	 * @param taxpayerSSN the taxpayerSSN to set
	 */
	public void setTaxpayerSSN(String taxpayerSSN) {
		this.taxpayerSSN = taxpayerSSN;
	}
	/**
	 * @return the taxpayerType
	 */
	public String getTaxpayerType() {
		return taxpayerType;
	}
	/**
	 * @param taxpayerType the taxpayerType to set
	 */
	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}
	/**
	 * @return the taxpayerMisc
	 */
	public String getTaxpayerMisc() {
		return taxpayerMisc;
	}
	/**
	 * @param taxpayerMisc the taxpayerMisc to set
	 */
	public void setTaxpayerMisc(String taxpayerMisc) {
		this.taxpayerMisc = taxpayerMisc;
	}
	/**
	 * @return the taxPeriod
	 */
	public LocalDate getTaxPeriod() {
		return taxPeriod;
	}
	/**
	 * @param taxPeriod the taxPeriod to set
	 */
	public void setTaxPeriod(LocalDate taxPeriod) {
		this.taxPeriod = taxPeriod;
	}
	/**
	 * @return the taxpayerCrossRefSSN
	 */
	public String getTaxpayerCrossRefSSN() {
		return taxpayerCrossRefSSN;
	}
	/**
	 * @param taxpayerCrossRefSSN the taxpayerCrossRefSSN to set
	 */
	public void setTaxpayerCrossRefSSN(String taxpayerCrossRefSSN) {
		this.taxpayerCrossRefSSN = taxpayerCrossRefSSN;
	}
	/**
	 * @return the mftDate
	 */
	public LocalDate getMftDate() {
		return mftDate;
	}
	/**
	 * @param mftDate the mftDate to set
	 */
	public void setMftDate(LocalDate mftDate) {
		this.mftDate = mftDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TaxpayerModel [recordID=" + recordID + ", nameControl=" + nameControl + ", taxpayerSSN=" + taxpayerSSN
				+ ", taxpayerType=" + taxpayerType + ", taxpayerMisc=" + taxpayerMisc + ", taxPeriod=" + taxPeriod
				+ ", taxpayerCrossRefSSN=" + taxpayerCrossRefSSN + ", mftDate=" + mftDate + "]";
	}
	
	
	
}
