package com.tejas.ipl.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity
public class Team {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totalMatches;
    private long totalWins;

    @Transient
    private List<com.fasterxml.jackson.databind.deser.DataFormatReaders.Match> matches;
    
    public List<com.fasterxml.jackson.databind.deser.DataFormatReaders.Match> getMatches() {
        return matches;
    }
    public void setMatches(List<com.fasterxml.jackson.databind.deser.DataFormatReaders.Match> list) {
        this.matches = list;
    }
    public Team(String string, long l) {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public long getTotalMatches() {
        return totalMatches;
    }
    public void setTotalMatches(long totalMatches) {
        this.totalMatches = totalMatches;
    }
    public long getTotalWins() {
        return totalWins;
    }
    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }
    public Team() {
    }

}
