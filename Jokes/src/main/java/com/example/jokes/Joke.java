package com.example.jokes;

import java.util.Random;

public class Joke {
    private static final String jokes[] = {"Banta: How did you find that doctor was fake?\n" +
            "Santa: Because he had a good handwriting!\n" +
            "\n",
            "A: Hey, man! Please call me a taxi.\n" +
                    "B: Yes, sir. You are a taxi. ",
            "A: Do you want to hear a dirty joke?\n" +
                    "B: Ok\n" +
                    "A: A white horse fell in the mud. ",
            "In a restaurant:\n" +
                    "\n" +
                    "Customer: Waiter, waiter! There is a frog in my soup!!!\n" +
                    "Waiter: Sorry, sir. The fly is on vacation. ",
            "Bank Teller: How do you like the money?\n" +
                    "English Student: I like it very much. "
    };

    public static String getJokes() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
