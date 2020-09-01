package com.example.bookstorebackend.service;

import com.example.bookstorebackend.models.Axolotl;

// this is java, add functionality to our axolotl service
public class AxolotlImpl  implements  AxolotlService {

    @Override
    public Axolotl getAxolotl() {
        Axolotl axolotlVarName = new Axolotl("Takis", 3);
        return axolotlVarName;
    }

    @Override
    public Iterable<Axolotl> listAxolotl() {
        return null;
    }
}
