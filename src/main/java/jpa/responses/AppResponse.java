package jpa.responses;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

public class AppResponse {
    
    public static Response error(String message, Response.Status status){
        JSONObject json = new JSONObject();
        json.put("message", message);

        return Response.status(status).entity(json.toString()).type(MediaType.APPLICATION_JSON).build();
    }

    public static Response success(Object o){
        return Response.status(Response.Status.OK).entity(o).type(MediaType.APPLICATION_JSON).build();
    }
    
}
