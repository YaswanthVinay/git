package com.yashwanth.BasicSpringBoot;

public class Player {

	
private int nub;
private String Name;
private String Team;
public int getNub() {
	return nub;
}
public void setNub(int nub) {
	this.nub = nub;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getTeam() {
	return Team;
}
public void setTeam(String team) {
	Team = team;
}
public Player(int nub, String name, String team) {
	super();
	this.nub = nub;
	Name = name;
	Team = team;
}

	

	
	
	
	}


