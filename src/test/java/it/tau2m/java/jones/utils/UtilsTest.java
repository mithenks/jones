package it.tau2m.java.jones.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

public class UtilsTest {
    
    @Test
    @SneakyThrows
    public void test1() {

        var myString = "Hello World";
        var myStringJson = "\"Hello World\"";

        var jsonData = Utils.toJSON(myString);
        System.out.println("jsonData: " + jsonData);

        assertTrue(jsonData.equals(myStringJson));

    }

    @Test
    @SneakyThrows
    public void test2() {

        int []intArray = {1};
        String []stringArray = {"Hello", "World"};
        var testObject = new TestObject(42, "Lorem ipsum", intArray, stringArray);
        var testObjectJson = "{\"intArray\":[1],\"stringArray\":[\"Hello\",\"World\"],\"int\":42,\"text\":\"Lorem ipsum\"}";

        var jsonData = Utils.toJSON(testObject);
        System.out.println("jsonData: " + jsonData);

        assertTrue(jsonData.equals(testObjectJson));
    }
}

@AllArgsConstructor
@Data
class TestObject {

    @JsonProperty("int")
    int intValue;
    @JsonProperty("text")
    String textValue;
    int []intArray;
    String[] stringArray;

    @JsonIgnore
    public String toJson() throws JsonProcessingException {
        return Utils.toJSON(this);
    }
}
