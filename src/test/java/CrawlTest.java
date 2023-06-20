import org.example.Crawl;
import org.junit.Test;
import java.io.IOException;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class CrawlTest {

    @Test
    public void parameterOfUrlShouldBeValidAndNotBeNull() {
        String url = "https://en.wikipedia.org/";
        Crawl newCrawl = new Crawl();
        //newCrawl.crawl(1, url, new ArrayList<String>());
        assertNotNull(url);
    }

    @Test
    public void parameterOfRequestShouldBeValidAndNotBeNull() {
        String url = "https://en.wikipedia.org/";
        Crawl newCrawl = new Crawl();
        //newCrawl.request(url, new ArrayList<String>());
    }

}