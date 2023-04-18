package com.od.dev.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/test")
@Controller
@RestController
public class NoteController {

    @GetMapping
    public String test(){
    return "Hello World";
    }
}
