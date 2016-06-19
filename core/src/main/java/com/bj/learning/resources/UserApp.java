package com.bj.learning.resources;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Created by wbj on 16-6-19.
 */
public class UserApp {
    public static void main(String[] args) throws Exception {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new ResourceConfig(UserResource.class, ColorResource.class);
        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
        server.start();
        server.join();
    }
}
