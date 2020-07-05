package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.Base;

public class Hooks extends Base {
    @Before("@mobile")
    public void beforevalidation(){
        System.out.println("executed before mobile testing only");
    }
    @After("@mobile")
    public void aftervalidation(){
        System.out.println("executed after mobile testing only");
    }
    @After("@SeleniumTest")
    public void afterSeleniumTest(){
      driver.close();
    }
}
