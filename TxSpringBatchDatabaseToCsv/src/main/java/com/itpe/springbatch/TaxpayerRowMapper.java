package com.itpe.springbatch;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.joda.time.LocalDate;
import org.springframework.jdbc.core.RowMapper;

import com.itpe.springbatch.model.TaxpayerModel;

public class TaxpayerRowMapper implements RowMapper<TaxpayerModel>{

	@Override
	public TaxpayerModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		TaxpayerModel tx = new TaxpayerModel();
		tx.setRecordID(rs.getInt("ID"));
		tx.setNameControl(rs.getString("NAME_CONTROL"));
		
		tx.setMftDate(new LocalDate(rs.getDate("MFT")));
		tx.setTaxPeriod(new LocalDate(rs.getDate("TAX_PERIOD")));
		
		tx.setTaxpayerCrossRefSSN(rs.getString("CROSS_REF_SSN"));
		tx.setTaxpayerMisc(rs.getString("MISC"));
		
		tx.setTaxpayerType(rs.getString("TAX_TYPE"));
		tx.setTaxpayerSSN(rs.getString("SSN"));
	
		return tx;
	} 

}
