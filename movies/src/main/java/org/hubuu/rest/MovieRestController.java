package org.hubuu.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieRestController {

    @RequestMapping(value = "/")
    public List<String> available() {
        List<String> movies = new ArrayList<>();
        movies.add("X-Men (2000)");
        movies.add("X2 (2003)");
        movies.add("X-Men: The Last Stand (2006)");
        movies.add("X-Men Origins: Wolverine (2009)");
        movies.add("X-Men: First Class (2011)");
        movies.add("The Wolverine (2013)");
        movies.add("X-Men: Days of Future Past (2014)");
        movies.add("Deadpool (2016)");
        movies.add("X-Men: Apocalypse (2016)");
        return movies;
    }

}
