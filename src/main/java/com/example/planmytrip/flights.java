package com.example.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() {return  "Please Book your flight tickets from book mytrip at 10% discont" ; }
}