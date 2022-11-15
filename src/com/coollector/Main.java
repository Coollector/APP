package com.coollector;

import javax.swing.*;

import com.coollector.errors.DuplicatePageName;
import com.coollector.errors.NoStartPage;
import com.coollector.errors.TwoStartPages;

import com.coollector.utils.Pages;
import com.coollector.utils.Window;
import org.json.JSONObject;

import static com.coollector.config.Register.paging;
import static com.coollector.utils.JSON.JSONFile;
import static com.coollector.utils.Pages.registerPage;

public class Main {
    Window window;
    String current;
    String last;
    public Main() {
        JSONObject mainConfig = JSONFile("src/com/coollector/config/main.json");
        window = new Window(mainConfig.getInt("width"), mainConfig.getInt("height"), mainConfig.getString("iconPath"), mainConfig.getString("title"));

        paging();

        run();
    }

    public static void main(String[] args){
        new Main();
    }

    public static void register(String name, JPanel page, boolean startpage) {
        try {
            registerPage(name, page, startpage);
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
