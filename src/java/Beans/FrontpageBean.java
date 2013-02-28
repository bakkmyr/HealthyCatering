package Beans;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("Frontpage")
public class FrontpageBean implements Serializable{
    private boolean loginActivated = false;

    public boolean isLoginActivated() {
        return loginActivated;
    }
    public void setLoginActivated(boolean piss) {
        loginActivated = piss;
    }
}