package com.spring.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.support.GenericWebApplicationContext;

//import com.baeldung.Spring5Application;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Spring5Application.class)
public class BeanRegistrationIntegrationTest {

    @Autowired
    private GenericWebApplicationContext context;


}
