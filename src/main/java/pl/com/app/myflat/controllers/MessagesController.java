package pl.com.app.myflat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessagesController {


        @GetMapping
        public String prepareLoginPage() {
            return "messages";
        }
    }
