package com.github.sgt_KittyKat.Javalin.HelloWorld;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/" , context -> {
            context.result("HELLO WORLD");
        });
        app.start(8080);
    }
}
