package com.mk.jokeapp.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MotherInLawQuotes {
    private ArrayList<String> quotes = new ArrayList<>();

    public MotherInLawQuotes () {
        this.quotes.add("Behind every successful man is a proud wife and surpised mother-in-law.");
        this.quotes.add("Conscience is a mother-in law whose visit never ends.");
        this.quotes.add("My mother-in-law ha a pin beneath her lfet breast. Turned out to be a trick knee.");
        this.quotes.add("My mother-in-law fell down a wishing well. I was amazed; I never knew they worked.");
        this.quotes.add("The mother-in-law is the centre of a family.");
        this.quotes.add("Be kind to your mother-in-law, but pay for her board at some good hotel.");
        this.quotes.add("A car is like mother-in-law - if you let it, it will rule your life.");
        this.quotes.add("My mother-in-law's from Norway, and she's always liked old-school remedies.");
    }

    public String getRandomQuote () {
        return this.quotes.get(ThreadLocalRandom.current().nextInt(1,this.quotes.size()));
    }
}
