package org.example;
import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.io.IOException;
public class Crawl {
    public static void crawl(int level, String url, ArrayList<String> visited) {

        if (level <= 5) {
            Document doc = request(url, visited);
            Document doc1 = request(url, visited);
            if (doc != null) {
                for (Element link : doc.select("a[href]")) {
                    String next_link = link.absUrl("href");
                    if (visited.contains(next_link) == false) {
                        crawl(level++, next_link, visited);
                    }
                }

            }
            if (doc1 != null) {
                for (Element link : doc1.select("img[src]")) {
                    String next_link = link.absUrl("src");
                    if (visited.contains(next_link) == false) {
                        crawl(level++, next_link, visited);
                    }
                }

            }
        }
    }

    public static Document request(String url, ArrayList<String> v) {
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();

            if (con.response().statusCode() == 200) {
                System.out.println("Link: " + url);
                System.out.println(doc.title());
                v.add(url);

                return doc;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}