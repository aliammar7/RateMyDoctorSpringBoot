package com.coffeecode.RateMyDoctorSpringBoot.services;
import com.coffeecode.RateMyDoctorSpringBoot.repositories.DoctorRepository;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

/**
 * Created by Ammar on 10/21/17.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class DoctorServices {

    @Autowired
    DoctorRepository doctorRepository;

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        doctorRepository.findById(1l);
        // Return some cliched textual content
        return "Hello World";
    }


}
