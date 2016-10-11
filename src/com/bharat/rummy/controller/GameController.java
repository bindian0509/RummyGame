package com.bharat.rummy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharat.rummy.delegate.LoginDelegate;
import com.bharat.rummy.domain.Game;
import com.bharat.rummy.domain.LoginBean;
import com.bharat.rummy.domain.Player;
import com.bharat.rummy.services.GameService;
import com.bharat.rummy.services.PlayerService;

@Controller
public class GameController {

	@Autowired
	PlayerService playerService;
	@Autowired
	GameService gameService;
	@Autowired
	LoginDelegate loginDelegate;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean) {
		ModelAndView model = new ModelAndView("login");
		// LoginBean loginBean = new LoginBean();
		model.addObject("loginBean", loginBean);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		ModelAndView model = null;
		try {
			System.out.println("USER DETAILS");
			System.out.println(loginBean.getUsername());
			System.out.println(loginBean.getPassword());
			int playerId = playerService.loginPlayer(loginBean.getUsername(), loginBean.getPassword());
			if (playerId > 0) {
				System.out.println("User Login Successful");
				request.setAttribute("playerId", playerId);
				model = new ModelAndView("dashboard");
			} else {
				model = new ModelAndView("login");
				request.setAttribute("message", "Invalid credentials!!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return model;
	}

	@RequestMapping("/register")
	public ModelAndView addPlayer(@ModelAttribute Player player) {

		List<String> typeList = new ArrayList<String>();
		typeList.add("NOVICE");
		typeList.add("BEGINNER");
		typeList.add("INTERMEDIATE");
		typeList.add("ADVANCED");
		typeList.add("EXPERT");

		Map<String, List> map = new HashMap<String, List>();
		map.put("typeList", typeList);

		return new ModelAndView("register", "map", map);
	}

	@RequestMapping("/insertPlayer")
	public String inserData(@ModelAttribute Player player) {
		if (player != null)
			playerService.insertData(player);
		return "redirect:/getList";
	}

	@RequestMapping("/getList")
	public ModelAndView getUserLIst() {
		List<Player> playerList = playerService.getPlayerList();
		return new ModelAndView("playerList", "playerList", playerList);
	}

	@RequestMapping("/loginPlayer")
	public String loginPlayer(@ModelAttribute Player player) {

		if (playerService.loginPlayer(player.getPlayerEmail(), player.getPlayerPassword()) >0)
			return "redirect:/dashboard";
		else
			return "redirect:/register";
	}

	@RequestMapping("/dashboard")
	public ModelAndView dashboard(@ModelAttribute Player player) {
		System.out.println("Inside Dashboard");
		System.out.println(player);
		return new ModelAndView("dashboard", "player", player);
	}

	@RequestMapping("/leaderboard")
	public ModelAndView leaderboard() {
		List<Player> playerList = playerService.getPlayerRankings();
		return new ModelAndView("leaderboard", "playerList", playerList);
	}

	@RequestMapping(value = { "/newgame/", "/newgame" }, method = RequestMethod.GET)
	public String newGame(@RequestParam String playerId) {
		if (playerId != null)
			gameService.newGame(playerId);
		return "redirect:/gameList";
	}

	@RequestMapping(value = { "/gameList/", "/gameList" }, method = RequestMethod.GET)
	public ModelAndView getPlayerBasedGameLIst(@RequestParam String playerId) {
		System.out.println(playerId);
		List<Game> gameList = gameService.getGamesFromPlayerId(playerId);
		System.out.println(gameList.size());
		return new ModelAndView("gameList", "gameList", gameList);
	}

}
