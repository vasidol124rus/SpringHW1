package ru.geekbrain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);

        // Сериализация в JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        // Десериализация из JSON
        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект: " + personFromJson);
    }
}
