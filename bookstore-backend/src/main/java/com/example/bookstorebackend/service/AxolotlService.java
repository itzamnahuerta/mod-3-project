package com.example.bookstorebackend.service;

import com.example.bookstorebackend.models.Axolotl;

public interface AxolotlService {
    public Axolotl getAxolotl(); // display axolotl
    public Iterable<Axolotl> listAxolotls(); // display list axolotl

}
