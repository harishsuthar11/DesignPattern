package com.example.builderdesignpattern;

import java.util.logging.Logger;

public class BuilderDesignPatternApplication {

    static Logger log = Logger.getLogger(BuilderDesignPatternApplication.class.getName());

    public static void main(String[] args) {

        log.info("Running Builder with Only Required Parameters");

        User user1 = new UserBuilder("Lokesh","Gupta")
                               .build();

        log.info("User Created "+user1);



        log.info("Running Builder with Optional Parameters");

        User user2 = new UserBuilder("Lokesh","Gupta")
                         .withAge(21)
                         .withAddress("Jalore")
                         .build();
        log.info("User Created "+user2);

    }

}
