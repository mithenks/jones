package it.tau2m.java.jones.data;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.tau2m.java.jones.utils.Utils;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class NewsRow {
    private final String id;
    private final String source;
    private final LocalDateTime date;
    private final String title;
    private final String subtitle;
    private final String link;

    public NewsRow(String jsonData) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        NewsRow newsRow = mapper.readValue(jsonData, NewsRow.class);
        
        this.id = newsRow.getId();
        this.source = newsRow.getSource();
        this.date = newsRow.getDate();
        this.title = newsRow.getTitle();
        this.subtitle = newsRow.getSubtitle();
        this.link = newsRow.getLink();
    }

    @JsonIgnore
    public String toJson() throws JsonProcessingException {

        return Utils.toJSON(this);
    }
}
