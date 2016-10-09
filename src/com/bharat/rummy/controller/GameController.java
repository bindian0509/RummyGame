package com.bharat.rummy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bharat.rummy.services.PlayerService;
import com.bharat.rummy.domain.Player;

@Controller
public class GameController {
	
	@Autowired 
	PlayerService playerService;
	
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute Player player) {
		return new ModelAndView("login");
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
		
		if(playerService.loginPlayer(player.getPlayerEmail(), player.getPlayerPassword())) 		
			return "redirect:/getList";
		else
			return "redirect:/register";
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView dashboard() {
		List<Player> playerList = playerService.getPlayerList();
		return new ModelAndView("playerList", "playerList", playerList);
	}
}
