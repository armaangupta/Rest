package com.lti.rest;
import javax.ws.rs.*;

public class EmployeeResource {
	@GET
	@Path("(empno)")
	@Produces("application/json")
	
	public String getJson(@PathParam("empno") int empno) {
		switch(empno) {
		case 1: return "('name':'Jon Snow','age':28)";
		case 2: return "('name':'Peter Norton','age':35)";
		default: return "('name':'Jack of All','age':18)";
		}
	}
}
