package com.restApp1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping("/book/{bname}")
    public ResponseEntity<String> getBookPrice(@PathVariable("bname") String bname){

        String resPayload = bname+" price is 400 $";

        return new ResponseEntity<>(resPayload, HttpStatus.OK);

    }

    @GetMapping("/book/name/{bname}/author/{aname}")
    public ResponseEntity<String> getBookDetails(@PathVariable("bname") String bname, @PathVariable("aname") String aname){

        String resPayload = bname+" book author is "+aname;

        return new ResponseEntity<>(resPayload, HttpStatus.OK);

    }
}
