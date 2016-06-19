package com.bj.learning.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by wbj on 16-6-19.
 */
@Path("/color")
public class ColorResource {

    @GET
    public String smooth(
            @DefaultValue("2") @QueryParam("step") int step,
            @DefaultValue("true") @QueryParam("min-m") boolean hasMin,
            @DefaultValue("true") @QueryParam("max-m") boolean hasMax,
            @DefaultValue("true") @QueryParam("last-m") boolean hasLast,
            @DefaultValue("blue") @QueryParam("min-color") ColorParam minColor,
            @DefaultValue("green") @QueryParam("max-color") ColorParam maxColor,
            @DefaultValue("red") @QueryParam("last-color") ColorParam lastColor) {

        System.out.println(step);
        System.out.println(hasMin);
        System.out.println(hasMax);
        System.out.println(hasLast);
        System.out.println(minColor);
        System.out.println(maxColor);
        System.out.println(lastColor);
        return step + ", " + hasMin;
    }
}
