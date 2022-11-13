package com.coollector;

import javax.swing.*;

import com.coollector.errors.DuplicatePageName;
import com.coollector.errors.NoStartPage;
import com.coollector.errors.PageNotExisting;
import com.coollector.errors.TwoStartPages;

import com.coollector.pages.home.HomePage;
import com.coollector.pages.turmRechner.Scene;
import com.coollector.utils.Pages;
import com.coollector.utils.Window;
import org.json.JSONObject;

import static com.coollector.utils.JSON.JSONFile;

public class Main {
    Window window;
    String current;
    String last;
    public Main() {
        JSONObject mainConfig = JSONFile("src/com/coollector/config/main.json");
        window = new Window(mainConfig.getInt("width"), mainConfig.getInt("height"), mainConfig.getString("iconPath"), mainConfig.getString("title"));


        // you can register your pages here, to load them from anywhere

        register("home", new HomePage(this));
        register("turmrechner", new Scene(), true);

    }

    public static void main(String[] args){
        new Main();
    }

    public void register(String name, JPanel page) {
        try {
            Pages.registerPage(name, page);
        } catch (DuplicatePageName e) {
            throw new RuntimeException(e);
        }
    }
    public void register(String name, JPanel page, boolean startpage) {
        try {
            Pages.registerPage(name, page, startpage);
        } catch (DuplicatePageName | TwoStartPages e) {
            throw new RuntimeException(e);
        }
    }

    public void loadPage(String pageName){
        last = current;
        current = pageName;
        window.loadScene(pageName);
    }

    public void stop(){
        System.exit(0);
    }

    public void lastPage(){
        loadPage(last);
    }

    public void run(){
        try {
            loadPage(Pages.startPage());
        } catch (NoStartPage e){
            throw new RuntimeException(e);
        }
    }
}
