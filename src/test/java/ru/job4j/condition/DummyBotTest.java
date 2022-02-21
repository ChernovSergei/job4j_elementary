package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String expected = "Hello egghead!";
        String in = "Hi Bot";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String expected = "Good bye!";
        String in = "Bye";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUknownBot() {
        String expected = "Your question is confusing me.";
        String in = "What is your favourite car?";
        String result = DummyBot.answer(in);
        Assert.assertEquals(expected, result);
    }
}