package com.bj.learning.resources;

import javax.ws.rs.*;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by wbj on 16-6-19.
 */
@Path("/user")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
public class UserResource {

    @GET
    @Path("/{uId}")
    public String getUser(@PathParam("uId") String uId){
        System.out.println("<<<<<<<<GET USER<<<<<<<<<<<<");
        return "uId:" + uId + ", name:Tom, age:30, sex:male";
    }

    @POST
//    @Path("/{user}")
    //localhost:8080/user?user=tom&user=jack
    public String addUser(@QueryParam("user") List<String> users, String body){
        System.out.println("=================ADD USER====================");
        System.out.println(users);
        System.out.println(body);
        return "success";
    }


    @PUT
    public String updateUser(@BeanParam UserBeanParam params, String entity) {
        System.out.printf("-------UPDATE USER---------" + entity);
        System.out.println(params);
        return "success";
    }

    @DELETE
    @Path("/{uId}")
    public void deleteUser(@PathParam("uId") String uId, String body) {
        System.out.println(">>>>>>>>>>>DELETE USER>>>>>>>>>>>>>");
        System.out.println(body);
    }
}
