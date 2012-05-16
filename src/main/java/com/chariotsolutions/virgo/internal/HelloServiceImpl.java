package com.chariotsolutions.virgo.internal;

import com.chariotsolutions.virgo.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: gordondickens
 * Date: 5/16/12
 * Time: 11:25 AM
 */
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
private String message = "Hello";


    @Override
    public void sayHello() {
        logger.debug("***** '{}' from the SERVICE! ******", message);
    }

    @Override
    public String getMessage() {
        logger.debug("***** Returning Message '{}' from the SERVICE! ******", message);
        return message;
    }


}
