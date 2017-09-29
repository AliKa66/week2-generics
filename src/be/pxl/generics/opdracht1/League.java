package be.pxl.generics.opdracht1;

import java.util.*;

public class League<T extends Player> {

	private List<Team<T>> teams;

	{
		teams = new ArrayList<>();
	}

	public void addTeam(Team<T> team) {
		teams.add(team);
	}

	public void printTeams() {
		for (Team<T> team : teams) {
			System.out.println(team.getName() + ": " + team.ranking());
		}
	}
}
