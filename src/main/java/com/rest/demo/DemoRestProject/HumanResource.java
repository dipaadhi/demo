package com.rest.demo.DemoRestProject;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("human")
public class HumanResource {
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
	public Human getHuman()
	{
		Human h1=new Human();
		h1.setName("ABC");
		h1.setId(1);
		return h1;
	}
	

}
