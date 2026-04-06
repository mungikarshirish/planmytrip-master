package com.example.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {return  "Please Book your holidays tickets from book mytrip at 10% discont" ; }
}