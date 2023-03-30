package it.tau2m.java.jones.data;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import org.junit.Test;

public class NewsRowTest {

    @Test
    public void testObjectData() {

        var localDateTime = LocalDateTime.now();
        var newsRow = new NewsRow("id", "source", localDateTime, "title", "subtitle", "link");

        assertEquals(newsRow.getId(), "id");
        assertEquals(newsRow.getTitle(), "title");
    }

    @Test
    public void testObjectJson() {

    }
}
