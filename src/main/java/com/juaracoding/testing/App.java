package com.juaracoding.testing;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();

        data.put("England", "London");
        data.put("Indonesia", "Jakarta");
        data.put("Norway", "Oslo");
        data.put("US", "Washington DC");

        System.out.println(data);
        System.out.println(data.get("England"));
        System.out.println(data.values());
        System.out.println(data.keySet());
        System.out.println("===========================");

        for (String key : data.keySet()) {
            System.out.printf("Ibukota %s adalah %s\n", key, data.get(key));
        }
    }
}
