package com.bharat.rummy.controller;

import org.springframework.stereotype.Controller;

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
public class PlayerController {
	@Autowired 
	PlayerService playerService;
	
	
}
