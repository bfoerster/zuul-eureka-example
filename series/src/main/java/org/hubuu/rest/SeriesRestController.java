package org.hubuu.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SeriesRestController {

    private int count = 1;

    @RequestMapping(value = "/")
    @HystrixCommand(fallbackMethod = "fallbackAvailable")
    public List<String> available() {

        // Simulate an error so the fallback method gets called.
        if(count % 3 == 0){
            count = 1;
            throw new RuntimeException("An error occured...");
        }
        count++;

        List<String> series = new ArrayList<>();
        series.add("Game of Thrones");
        series.add("Person of Interest");
        series.add("The Walking Dead");
        series.add("MacGyver");
        return series;
    }

    /**
     * This is a fallback method to call in case of an error.
     */
    public List<String> fallbackAvailable(){
        List<String> books = new ArrayList<>();
        books.add("A-Team");
        return books;
    }
}
