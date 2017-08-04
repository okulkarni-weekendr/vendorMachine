package com.vendorMachine.Analytics;

import com.vendorMachine.domain.Users.GasStationCustomer;

public class CustomerReportFormatter extends ReportFormatter {
	public CustomerReportFormatter(GasStationCustomer gsCustomer, FormatType formatType) {
		super(gsCustomer, formatType);
	}

	public String getFormattedCustomer(){
		return getFormattedOutput();
	}
}
