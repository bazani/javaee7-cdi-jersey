package com.bazanisistemas.test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing {
	@BeforeSuite
	public void init() throws NamingException {
		//starts openEJB container for tests
		EJBContainer.createEJBContainer().getContext().bind("inject", this);
	}
	
	@Test
	public void shouldCreate() {
		//Method contents
	}
	
	@Test(dependsOnMethods = {"shouldCreate"}) 
	public void shouldList() { 
		//Method contents
	}
	
	@Test(expectedExceptions = {javax.ejb.EJBException.class})
	public void shouldFailPropertyRequired() {
		//Method contents
	}
}