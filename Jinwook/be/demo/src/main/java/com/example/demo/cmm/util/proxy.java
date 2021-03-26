package com.example.demo.cmm.util;

import java.util.function.Consumer;

public class proxy {
    public static Consumer<String> println = System.out::println;
}
