package com.aricent.abhi.demo;

import javax.jws.WebService;

@WebService(endpointInterface="com.aricent.abhi.demo.CalculatorDemo",portName="calculatorDemoPort",serviceName="calculatorDemo")
public class CalculatorDemoImpl implements CalculatorDemo {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
