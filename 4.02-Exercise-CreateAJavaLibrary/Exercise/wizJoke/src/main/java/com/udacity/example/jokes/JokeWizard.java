package com.udacity.example.jokes;

import java.lang.String;

public class JokeWizard {
	public String getJoke(){
		JokeSmith jokeSmith = new JokeSmith();
		return "Wizard says: " + jokeSmith.getJoke();
	}
}
