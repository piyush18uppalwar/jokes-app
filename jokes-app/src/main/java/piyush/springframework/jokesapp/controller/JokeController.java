package piyush.springframework.jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import piyush.springframework.jokesapp.service.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJokes(Model model) {
		model.addAttribute("joke",jokeService.getJoke());
		return "index";
	}

}
