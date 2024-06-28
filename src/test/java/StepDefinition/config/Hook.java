package StepDefinition.config;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hook {

    @Before
    public void setup() throws MalformedURLException {
        DriverFactory.setUp();
    }

    @After
    public void tearDown() {
        DriverFactory.tearDown();
    }
}
