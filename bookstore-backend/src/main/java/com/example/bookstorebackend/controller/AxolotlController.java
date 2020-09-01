package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.models.Axolotl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/axolotl")
public class AxolotlController {
    @GetMapping // going to instantiate a new axolotl object and return it
    public Axolotl getAxolotl() {
        Axolotl axolotlVarName = new Axolotl("Takis", 3);
        return axolotlVarName;
    }

}
