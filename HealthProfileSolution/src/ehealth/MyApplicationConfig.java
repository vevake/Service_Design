package ehealth;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("LifestyleCoach")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("ehealth");
    }
}
