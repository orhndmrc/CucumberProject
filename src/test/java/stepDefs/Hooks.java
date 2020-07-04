package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@mobile")
    public void beforevalidation(){
        System.out.println("executed before mobile testing only");
    }

    @After("@mobile")
    public void aftervalidation(){
        System.out.println("executed after mobile testing only");
    }

}
