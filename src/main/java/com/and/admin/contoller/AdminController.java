package com.and.admin.contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Timothy on 8/30/2017.
 *
 */
@RestController
public class AdminController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Danylle Anderson!";
    }

}