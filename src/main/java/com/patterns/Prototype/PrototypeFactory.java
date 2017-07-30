package com.patterns.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vetriselvan on 30-07-2017.
 */
public class PrototypeFactory {
    public static void main(String args[]) {
        String[] persons = {"tom", "dick", "harry"};
        for(String type : persons) {
            Person person = Factory.getPrototype(type);
            if(person != null)
                System.out.println(person);
        }
    }
}

interface Person {
    Person clone();
}

class Tom implements Person {
    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        Person person = (Person)obj;
        if(this.NAME != null && person.toString() != null && this.NAME.equals(person.toString()))
            return true;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (NAME == null ? 0 : NAME.hashCode());
        return result;
    }
}

class Dick implements Person {
    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        Person person = (Person)obj;
        if(this.NAME != null && person.toString() != null && this.NAME.equals(person.toString()))
            return true;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (NAME == null ? 0 : NAME.hashCode());
        return result;
    }
}

class Harry implements Person {
    private final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        Person person = (Person)obj;
        if(this.NAME != null && person.toString() != null && this.NAME.equals(person.toString()))
            return true;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (NAME == null ? 0 : NAME.hashCode());
        return result;
    }
}

class Factory {
    private static final  Map<String, Person> prototypes = new HashMap<String, Person>();
    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        }catch(NullPointerException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}