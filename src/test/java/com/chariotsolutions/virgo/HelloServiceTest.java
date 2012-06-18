package com.gordondickens.virgo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * User: gordondickens
 * Date: 5/16/12
 * Time: 11:36 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/module-context.xml")
public class HelloServiceTest {
    @Autowired
    HelloService helloService;

    @Test
    public void testMessageService() {
        assertNotNull("Hello Service is REQUIRED!", helloService);
        assertEquals("Message MUST match!", "Hello", helloService.getMessage());
    }
}
