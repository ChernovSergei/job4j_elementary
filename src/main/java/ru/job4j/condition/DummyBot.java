package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Your question is confusing me.";
        if ("Hi Bot".equals(question)) {
            rsl = "Hello egghead!";
        } else if ("Bye".equals(question)) {
            rsl = "Good bye!";
        }
        return rsl;
    }

    public  static void main(String[] args) {
        String rsl = DummyBot.answer("Hi Bot");
        System.out.println(rsl);
        rsl = DummyBot.answer("What is your favourite car?");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye");
        System.out.println(rsl);
    }
}
