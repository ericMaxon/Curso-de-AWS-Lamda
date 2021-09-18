package com.aprendiendo.aws.handler;

import com.aprendiendo.aws.handler.dto.Shoe;

import java.util.List;

import static java.util.Arrays.*;

public class Database {
    List<Shoe> shoeList;

    public Database() {
        shoeList = asList(
                new Shoe(1, "Jordan"),
                new Shoe(2, "Nike"),
                new Shoe(3, "Adidas")
        );
    }

    List<Shoe> getShoes() {
        return shoeList;
    }

    Shoe getShoeById(int id) {
        return shoeList.stream().filter((s -> s.getId() == id)).findFirst().orElse(null);
    }
}
