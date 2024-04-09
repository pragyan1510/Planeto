package com.example.planetsapp;

//this class is acting as model class for our listview
public class planet {
    //attributes
    private String planetname;
    private String mooncount;
    private int planetimg;

    //constructor


    public planet(String planetname, String mooncount, int planetimg) {
        this.planetname = planetname;
        this.mooncount = mooncount;
        this.planetimg = planetimg;
    }

    //getters and setters

    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    public String getMooncount() {
        return mooncount;
    }

    public void setMooncount(String mooncount) {
        this.mooncount = mooncount;
    }

    public int getPlanetimg() {
        return planetimg;
    }

    public void setPlanetimg(int planetimg) {
        this.planetimg = planetimg;
    }
}
