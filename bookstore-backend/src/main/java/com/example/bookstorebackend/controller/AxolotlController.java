package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.models.Axolotl;
import com.example.bookstorebackend.service.AxolotlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/axolotl")
public class AxolotlController {
    @Autowired // instead of making an object like AxolotlServiceImpl axolotlService = new AxolotlServiceImpl(), that an object from the axolotl class and has a few methods, but its directly impacted by the implementation which cause a problem (if service fails, you're screwed & it's harder to test because of the tightly coupled dependency)
    AxolotlService axolotlService;

    @GetMapping // going to instantiate a new axolotl object and return it
    public Axolotl getAxolotl() {
        return axolotlService.getAxolotl();
    }

    @GetMapping("/listall")
    public Iterable<Axolotl> listAxolotls() {
        return axolotlService.listAxolotls();
    }
}
