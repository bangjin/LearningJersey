package com.bj.learning.resources;

import javax.ws.rs.*;

public class UserBeanParam {
    @PathParam("p")
    private String pathParam;
 
    @MatrixParam("m")
    @Encoded
    @DefaultValue("default")
    private String matrixParam;
 
    @HeaderParam("header")
    private String headerParam;
 
    private String queryParam;
 
    public UserBeanParam(@QueryParam("q") String queryParam) {
        this.queryParam = queryParam;
    }
 
    public String getPathParam() {
        return pathParam;
    }
}