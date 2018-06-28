package com.company.service;

public class TestClinet {

	public static void main(String[] args)throws Exception {
		java.net.URL endpointurl= new java.net.URL("http://localhost:8080/CalulatorService/services/CalService");
		org.apache.axis.client.Service Service = new org.apache.axis.client.Service();
		CalServiceSoapBindingStub stub= new CalServiceSoapBindingStub(endpointurl,Service);
		
		int addresult = stub.add(10, 20);
		System.out.println("ADD Result   "+addresult);
		
		int subresult = stub.sub(20, 10);
		System.out.println("SUB Result   "+subresult);

	}

}
