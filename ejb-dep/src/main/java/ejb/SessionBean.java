package ejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class SessionBean {

    public String businessMethod() {
        if (false) {
            throw new RuntimeException();
        }
        return "coolas";
    }

}