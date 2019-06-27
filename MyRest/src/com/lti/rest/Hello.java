package com.lti.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Hello")
public class Hello {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHello() {
	return "Hello Jersey Plain";
}


@GET
@Path("/xmlHello")
@Produces(MediaType.TEXT_XML)
public String sayPlainXMLHello() {
	return "<?xml version=\"1.0\"?>"+"<hello>Hello Jersey"+"</hello>";
}

@GET
@Produces(MediaType.TEXT_HTML)
public String sayHTMLHello() {
	return "<HTML>"+"<TITLE>"+"Hello Jersey"+"</title>"+"<body><h1>"
+"Hello Jersey HTML"+"</h1></body>"+"</html>";
}

}
