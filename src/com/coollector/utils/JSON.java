package com.coollector.utils;

import java.io.FileReader;
import java.io.IOException;

import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {

    @SuppressWarnings("unchecked")
    public static JSONObject JSONFile(String path) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(path))
        {
            return new JSONObject(jsonParser.parse(reader).toString());
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

