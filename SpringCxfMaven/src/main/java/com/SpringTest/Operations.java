package com.SpringTest;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Operations {
	@WebMethod
	public int sum(int a,int b);
	@WebMethod
	public int multiply(int a,int b);
	@WebMethod
	public int divide(int a,int b);
}
