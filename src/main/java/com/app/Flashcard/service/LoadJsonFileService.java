package com.app.Flashcard.service;

import com.app.Flashcard.entity.Grammar;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoadJsonFileService {

    public <T> List<T> loadJsonFile(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonFactory f = new JsonFactory();
            List<T> listItems = null;
//            File resource = ResourceUtils.getFile("classpath:JSON/" + fileName + ".json");
            URL url = ResourceUtils.getURL("classpath:JSON/" + fileName + ".json");
            JsonParser jp = f.createParser(url);
            TypeReference<List<T>> tRef = new TypeReference<List<T>>() {
            };
            listItems = mapper.readValue(jp, tRef);
            return listItems;
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<T>();
    }
}
