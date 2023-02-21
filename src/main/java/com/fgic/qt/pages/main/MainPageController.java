package com.fgic.qt.pages.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @GetMapping(value = {"/", "/main"})
    public String mainPage() {
        return "test";
    }
}
