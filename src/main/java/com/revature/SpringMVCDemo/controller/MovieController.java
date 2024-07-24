package com.revature.SpringMVCDemo.controller;

import com.revature.SpringMVCDemo.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping
    public ResponseEntity<String> getMovies(){
        return ResponseEntity.status(202).body("You got no movies on the list yet :)");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){

        Movie movie = new Movie(
                id,
                "Money Heist",
                "June 18,2020",
                2
        );

        return ResponseEntity.ok(movie);
    }

    @PostMapping("/req_body")
    public ResponseEntity<String> sendReqBody(@RequestBody int n){
        return ResponseEntity.ok("Request Body: "+n+". Thanks!");
    }

    @PostMapping("/req_param")
    public ResponseEntity<String> sendReqParam(@RequestParam int year){
        return ResponseEntity.ok("Request Param: "+year+". Thanks!");
    }

}
