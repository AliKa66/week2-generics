package be.pxl.generics.opdracht1;

import java.util.*;

public class Team<T extends Player> {

	private String name;
	private int played, won, lost, tied;
	private List<T> members;

	{
		members = new ArrayList<>();
	}

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}

	public ArrayList<T> getMembers() {
		return ((ArrayList<T>) members);
	}

	public void addPlayer(T player) {
		if (!members.contains(player)) {
			members.add(player);
		}
	}

	public int numberOfPlayers() {
		return members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			this.won++;
		} else if (ourScore < theirScore) {
			this.lost++;
		} else {
			this.tied++;
		}
		this.played++;

		if (opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	}

	public int ranking() {
		return (3 * this.getWon()) + this.getTied();
	}
}
