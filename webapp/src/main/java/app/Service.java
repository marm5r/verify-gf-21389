package app;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import ejb.SessionBean;

@Stateless
@LocalBean
public class Service {

    @Inject
    private SessionBean bean;

    public String businessMethod() {
        return bean.businessMethod();
    }

}
