package com.coollector.utils;

import org.json.JSONObject;

public class Language {
    private String language;
    private JSONObject file;

    public Language(String language){
        this.language = language;
        this.file = JSON.JSONFile("src/languages/" + language + ".json");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
        this.file = JSON.JSONFile("src/languages/" + language + ".json");
    }

    public String get(String message){
        return this.file.getString(message);
    }
}
