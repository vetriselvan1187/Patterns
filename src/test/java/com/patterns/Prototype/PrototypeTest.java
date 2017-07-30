package com.patterns.Prototype;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

/**
 * Created by Vetriselvan on 30-07-2017.
 */
public class PrototypeTest {

    //since clone creates new reference of the original copy equals should be fals
    @Test
    public void testTomPrototype() {
        Person tom = new Tom();
        Person tom2 = Factory.getPrototype("tom");
        assert(tom.equals(tom2));
    }

    @Test
    public void testDickProtoType() {
        Person dick = new Dick();
        Person testDick = Factory.getPrototype("dick");
        assert(dick.equals(testDick));
    }

    @Test
    public void testReferenceNotEqual() {
        Person harry = new Harry();
        Person testHarry = Factory.getPrototype("harry");
        assert(harry == testHarry);
    }
}
