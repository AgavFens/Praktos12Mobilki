package com.example.praktos12mobilki;

public class State {

    private String name; // название
    private String capital;  // столица
    private int NarodResource; // narod

    public State(String name, String capital, int flag){

        this.name=name;
        this.capital=capital;
        this.NarodResource=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getNarodResource() {
        return this.NarodResource;
    }

    public void setNarodResource(int NarodResource) {
        this.NarodResource = NarodResource;
    }
}
