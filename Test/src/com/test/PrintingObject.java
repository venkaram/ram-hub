package com.test;

public class PrintingObject {
	
	private String documentClass;
	private String documentId;
	private String tmCode;
	public String getDocumentClass() {
		return documentClass;
	}
	public void setDocumentClass(String documentClass) {
		this.documentClass = documentClass;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getTmCode() {
		return tmCode;
	}
	public void setTmCode(String tmCode) {
		this.tmCode = tmCode;
	}
	@Override
	public String toString() {
		return "PrintingObject [documentClass=" + documentClass
				+ ", documentId=" + documentId + ", tmCode=" + tmCode + "]";
	}

}
