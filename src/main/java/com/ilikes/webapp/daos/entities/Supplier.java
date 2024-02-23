package com.ilikes.webapp.daos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity (name = "suppliers")
public class Supplier {

    @Id
    private Integer id;
    private String name;
    /*@ManyToOne
    private Product product;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
