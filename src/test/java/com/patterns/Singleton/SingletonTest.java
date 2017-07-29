package com.patterns.Singleton;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

/**
 * Created by Vetriselvan on 29-07-2017.
 */
public class SingletonTest {

    @Test
    public void testSingleton(){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        assert(singleton1 == singleton2);
    }
}
