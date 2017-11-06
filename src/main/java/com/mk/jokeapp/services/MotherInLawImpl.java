package com.mk.jokeapp.services;

import com.mk.jokeapp.model.MotherInLawQuotes;
import org.springframework.stereotype.Service;

@Service
public class MotherInLawImpl implements JokeService {

    private final MotherInLawQuotes motherInLawQuotes;

    public MotherInLawImpl() {
        this.motherInLawQuotes = new MotherInLawQuotes();
    }

    @Override
    public String getJoke() {
        return motherInLawQuotes.getRandomQuote();
    }
}
