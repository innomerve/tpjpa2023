package jpa.responses;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

public class AppResponse {
    
    public static Response error(String message, Response.Status status){
        JSONObject json = new JSONObject();
        json.put("message", message);

        return Response.status(status)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers",
            "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", 
            "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(json.toString()).type(MediaType.APPLICATION_JSON).build();
    }

    public static Response success(Object o){
        return Response.status(Response.Status.OK)
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers",
            "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods", 
            "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .entity(o)
        .type(MediaType.APPLICATION_JSON).build();
    }
    
}
