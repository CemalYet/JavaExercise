package com.company;

public class GenericMain {
    public static void main(String[] args) {
        GenericBaseballTeam base1 = new GenericBaseballTeam("base1",55);
        GenericBaseballTeam base2 = new GenericBaseballTeam("base2",45);
        GenericBaseballTeam base3 = new GenericBaseballTeam("base3",65);

        GenericFootballTeam foot1 = new GenericFootballTeam("foot1",23);
        GenericFootballTeam foot2 = new GenericFootballTeam("foot2",67);
        GenericFootballTeam foot3 = new GenericFootballTeam("foot3",45);



        GenericLeague <GenericBaseballTeam>myLeague = new GenericLeague<>("Baseball");
        myLeague.addTeam(base1);
        myLeague.addTeam(base2);
        myLeague.addTeam(base3);
        myLeague.printLeagueTable();
        System.out.println("\n");
        GenericLeague<GenericFootballTeam> footballLeague = new GenericLeague<>("Football League");
        footballLeague.addTeam(foot2);
        footballLeague.addTeam(foot1);
        footballLeague.addTeam(foot3);
        footballLeague.printLeagueTable();



    }
}
