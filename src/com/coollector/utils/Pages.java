package com.coollector.utils;

import com.coollector.errors.DuplicatePageName;
import com.coollector.errors.NoStartPage;
import com.coollector.errors.PageNotExisting;
import com.coollector.errors.TwoStartPages;

import javax.swing.*;
import java.util.ArrayList;

public class Pages {
    public static ArrayList<String> pageNames = new ArrayList<String>();

    public static ArrayList<JPanel> pages = new ArrayList<>();

    public static String startPage;

    public static void registerPage(String name, JPanel page) throws DuplicatePageName{
        if (!pageNames.contains(name)){
            pageNames.add(name);
            pages.add(page);
        } else {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                throw new DuplicatePageName(" DuplicatedPageName : not two same page names. Duplicated name: " + name, e);
            }
        }
    }

    public static void registerPage(String name, JPanel page, boolean isStartPage) throws TwoStartPages, DuplicatePageName{
        if (isStartPage) {
            if (!pageNames.contains(name)) {
                startPage = name;
            } else {
                try {
                    throw new RuntimeException();
                } catch (RuntimeException e) {
                    throw new TwoStartPages(" TwoStartPages : You can not have two StartPages: " + startPage + ", " + name, e);
                }
            }
        }
        registerPage(name, page);
    }


    public static JPanel getPage(String name) throws PageNotExisting{
        if (pageNames.contains(name)){
            return pages.get(pageNames.indexOf(name));
        } else {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                throw new PageNotExisting(" PageNotExisting : the page " + name + " does not exist", e);
            }
        }
    }

    public static String startPage() throws NoStartPage{
        if (pageNames.contains(startPage)){
            return startPage;
        } else if (pageNames.contains("home")){
            return "home";
        } else {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                throw new NoStartPage(" NoStartPage : There is no Startpage defined", e);
            }
        }
    }
}
