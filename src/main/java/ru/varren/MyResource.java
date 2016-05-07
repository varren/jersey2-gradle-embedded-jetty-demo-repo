package ru.varren;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("test")
public class MyResource {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response  getPersons() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("id", "1");
        return Response.ok("{\"id\":1}").build();
    }

}