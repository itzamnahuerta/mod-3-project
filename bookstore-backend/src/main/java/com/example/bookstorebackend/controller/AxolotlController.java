package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.models.Axolotl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/axolotl")
public class AxolotlController {
    @GetMapping // going to instantiate a new axolotl object and return it
    public Axolotl getAxolotl() {
        Axolotl axolotlVarName = new Axolotl("Takis", 3);
        return axolotlVarName;
    }
    @GetMapping("/listall")
    public Iterable<Axolotl> listCats() {
        ArrayList axolotls = new ArrayList<Axolotl>();
        axolotls.add(new Axolotl("Lupe", 6));
        axolotls.add(new Axolotl("Ixtel", 12));
        axolotls.add(new Axolotl("Angel", 2));
        axolotls.add(new Axolotl("Queztal", 3));
        axolotls.add(new Axolotl("Benito", 8));

        return axolotls;
    }
}
