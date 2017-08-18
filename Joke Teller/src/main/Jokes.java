package main;

import java.util.HashMap;

public class Jokes {
	//list of jokes
	String[] joke = {"<html>I used to know a guy with huge eyebrows... the biggest you'll ever see, and I asked him:<br>"
			+ "	'So what do you usually do with your free time?'<br>"
			+ "And he said:<br>"
			+ "	'eye-brows the internet'</html>",
			
			"<html>Why did the chicken cross the road?<br>"
			+ "	To get to the other side</html>",
			
			"<html>What happened to the lumberjack who cut too many trees?<br>"
			+ "	He saw too much</html>"};
	
	//public static so that it can be accessed from JokeTeller.java
	public static HashMap<Integer, String> jokeMap = new HashMap<Integer, String>();
	
	public void addJokes() {
		for(int i = 0; i < joke.length; i++) {
			jokeMap.put(i, joke[i]);
		}
	}
	
	

	
}
