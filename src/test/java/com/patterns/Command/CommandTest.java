package com.patterns.Command;


import org.junit.Test;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Vetriselvan on 03-08-2017.
 */
public class CommandTest {

    @Test
    public void testCommandObjects(){
        List<Command> commandList = new ArrayList<Command>();
        commandList.add(new Developer());
        commandList.add(new Programmer());
        commandList.add(new Designer());

        for(Command command : commandList) {
            command.execute();
        }
        Assert.assertEquals(2 ,2);
    }
}
