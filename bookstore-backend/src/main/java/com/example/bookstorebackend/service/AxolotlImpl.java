package com.example.bookstorebackend.service;

import com.example.bookstorebackend.models.Axolotl;

import java.util.ArrayList;

// this is java, add functionality to our axolotl service
public class AxolotlImpl  implements  AxolotlService {

    @Override
    public Axolotl getAxolotl() {
        Axolotl axolotlVarName = new Axolotl("Takis", 3);
        return axolotlVarName;
    }

    @Override
    public Iterable<Axolotl> listAxolotls() {
        ArrayList axolotls = new ArrayList<Axolotl>();
        axolotls.add(new Axolotl("Lupe", 6));
        axolotls.add(new Axolotl("Ixtel", 12));
        axolotls.add(new Axolotl("Angel", 2));
        axolotls.add(new Axolotl("Queztal", 3));
        axolotls.add(new Axolotl("Benito", 8));

        return axolotls;
    }
}
