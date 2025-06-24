package com.f1analyzer.f1_race_analyzer.model;

public class DriverInfo {
    private int driver_number;
    private String broadcast_name;
    private String full_name;
    private String team_name;
    private String country_code;

    // Getters and setters
    public int getDriver_number() { return driver_number; }
    public void setDriver_number(int driver_number) { this.driver_number = driver_number; }

    public String getBroadcast_name() { return broadcast_name; }
    public void setBroadcast_name(String broadcast_name) { this.broadcast_name = broadcast_name; }

    public String getFull_name() { return full_name; }
    public void setFull_name(String full_name) { this.full_name = full_name; }

    public String getTeam_name() { return team_name; }
    public void setTeam_name(String team_name) { this.team_name = team_name; }

    public String getCountry_code() { return country_code; }
    public void setCountry_code(String country_code) { this.country_code = country_code; }
}