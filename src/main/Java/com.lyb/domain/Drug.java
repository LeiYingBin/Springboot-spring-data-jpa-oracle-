package com.lyb.domain;

import javax.persistence.*;

@Entity
public class Drug {

    @Id

    private String id;

    @Column
    private String drug_num;

    @Column
    private String drug_name;

    @Column
    private String price;

    @Column
    private String type;

    @Column
    private int amount;

    @Column
    private int drug_state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDrug_num() {
        return drug_num;
    }

    public void setDrug_num(String drug_num) {
        this.drug_num = drug_num;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDrug_state() { return drug_state;    }

    public void setDrug_state(int drug_state) {  this.drug_state = drug_state;    }
}
