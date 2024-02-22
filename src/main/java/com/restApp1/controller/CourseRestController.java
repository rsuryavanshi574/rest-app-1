package com.restApp1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

    @GetMapping("/course")
    public ResponseEntity<String> getCourseDetails(@RequestParam("cName") String cName,@RequestParam("tName") String tName){
        String resPayload = cName+" by "+tName+" sir, fee is 1000 rupees";

        return new ResponseEntity<>(resPayload, HttpStatus.OK);
    }
}
