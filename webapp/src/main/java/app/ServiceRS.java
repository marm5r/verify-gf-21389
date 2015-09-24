package app;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("rs")
public class ServiceRS {

    @Inject
    private Service bean;

    @GET
    public String get() {
        return bean.businessMethod();
    }

}
