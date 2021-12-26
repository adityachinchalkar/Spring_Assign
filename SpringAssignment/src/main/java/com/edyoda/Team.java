package com.edyoda;

public class Team implements User {

    private String TeamNAme;
    private Integer Number;

    @Override
    public String displayinfo() {
        return String.format("TeamName %s, Number %d",TeamNAme, Number);
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public String getPhone() {
        return getPhone();
    }

    public String getTeamNAme() {
        return TeamNAme;
    }

    public void setTeamNAme(String teamNAme) {
        TeamNAme = teamNAme;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }
}
