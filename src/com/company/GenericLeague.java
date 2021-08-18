package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericLeague <T extends GenericTeam >   {
    private String name;

     List<T> leagueTable = new ArrayList<T>();

    public GenericLeague(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(leagueTable.contains(team)){
            System.out.println("Team is already in the list");
            return false;
        }else {
            leagueTable.add(team);
            System.out.println(team.getName()+" is added to the league");
            return true;
        }
    }


    public void printLeagueTable(){
       Collections.sort(leagueTable);
        for (T team:leagueTable
             ) {
            System.out.println(team.getName()+" ---> "+team.getPoint());
        }
    }
}
