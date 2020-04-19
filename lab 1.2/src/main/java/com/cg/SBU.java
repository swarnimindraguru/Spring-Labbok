package com.cg;

import org.springframework.beans.factory.annotation.Value;

public class SBU {
	
	@Value("${sbucode}")
	private String sbucode;
	@Value("${sbuhead}")
	private String sbuhead;
	@Value("${sbuname}")
	private String sbuname;
	
	
	

	public SBU() {
	}

	public void sbudisplay() {
		System.out.println("sbu details= SBU [ sbuCode ="+sbucode+", sbuHead ="+sbuhead+ ", sbuName ="+sbuname+" ]]");
		
	}
}
