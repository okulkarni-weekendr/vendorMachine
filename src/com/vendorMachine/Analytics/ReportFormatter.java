package com.vendorMachine.Analytics;

public class ReportFormatter{

	public ReportFormatter(Object object, FormatType formatType){

	}

	private String convertObjectToXML(Object object){
		return "XML: <title>" + object.toString() + "</title>";
	}

	private String convertObjectToCSV(Object object){
		return "CSV: ,,," + object.toString()+ ",,,";
	}
}