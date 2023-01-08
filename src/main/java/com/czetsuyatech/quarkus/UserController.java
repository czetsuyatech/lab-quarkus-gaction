package com.czetsuyatech.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/users")
public class UserController {

  @GET
  public String greeting(@QueryParam("name") String name) {
    return "Hello " + name;
  }
}
