package org.example;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String url = "https://en.wikipedia.org/";
        Crawl newCrawl = new Crawl();
        newCrawl.crawl(1, url, new ArrayList<String>());
    }

}