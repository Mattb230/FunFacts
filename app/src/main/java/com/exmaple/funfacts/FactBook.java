package com.exmaple.funfacts;

import java.util.Random;

/**
 * Created by Matthew Boydston on 9/13/2016.
 */
public class FactBook {
    //Fields (member variables) go here. properties of the object
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };
    //methods: Actions the object can take

    // Gets a random fact from the array, and assigns it to the Fact variable
    public String getFact(){
        String fact = mFacts[new Random().nextInt(mFacts.length)];
        return fact;
    }
}
