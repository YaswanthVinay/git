package com.yashwanth.BasicSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class playerController {

	@GetMapping("/mumbai")
	public Player getplayerinfo() {
		return new Player(45, "Rohit", "Mumbai");
	}

	@GetMapping("/players")
	public List<Player> player() {
		List<Player> playerdetails = new ArrayList<Player>();
		playerdetails.add(new Player(7, "Dhoni", "India"));
		playerdetails.add(new Player(18, "Kohli", "India"));
		playerdetails.add(new Player(17, "ABD", "SA"));
		playerdetails.add(new Player(49, "Smith", "Australia"));
		return playerdetails;

	}

	// PATHVARIABLE
	@GetMapping("{nub}/{Name}/{Team}")
	public Player pathvariable(@PathVariable(name = "nub") int nub, @PathVariable(name = "Name") String Name,
			@PathVariable(name = "Team") String Team) {
		return new Player(nub, Name, Team);
	}

	// REQUESTPARAM
	@GetMapping("/details")
	public Player details(@RequestParam(name = "nub") int nub, @RequestParam(name = "Name") String Name,
			@RequestParam(name = "Team") String Team) {
		return new Player(nub, Name, Team);
	}

}
