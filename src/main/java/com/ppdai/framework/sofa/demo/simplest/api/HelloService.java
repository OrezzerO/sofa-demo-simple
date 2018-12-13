package com.ppdai.framework.sofa.demo.simplest.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author zhangchengxi
 * Date 2018/11/26
 */
@Path("/")
@Consumes("application/json;charset=UTF-8")
@Produces("application/json;charset=UTF-8")
public interface HelloService {
    @GET
    @Path("/hello")
    String sayHello();

    @GET
    @Path("/goodbye")
    String sayGoodbye();
}

