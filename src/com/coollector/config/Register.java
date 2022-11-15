package com.coollector.config;

import com.coollector.pages.home.HomePage;
import com.coollector.pages.turmRechner.Scene;

import static com.coollector.Main.register;

public class Register {
    public static void paging(){

        // you can register your pages here, to load them from anywhere

        register("home", new HomePage(), false);
        register("turmrechner", new Scene(), true);
    }
}
