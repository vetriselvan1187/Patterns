package com.patterns.Command;

/**
 * Created by Vetriselvan on 03-08-2017.
 */
interface Command {
    public void execute();
}

class Developer implements Command {

    public void execute() {
        System.out.println("Executing Developer Commands");
    }
}

class Designer implements  Command {

    public void execute() {
        System.out.println("Executing Designer Commands");
    }
}

class Programmer implements  Command {

    public void execute() {
        System.out.println("Executing Programmer Commands");
    }
}