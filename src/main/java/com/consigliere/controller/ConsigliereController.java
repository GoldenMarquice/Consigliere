package com.consigliere.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.consigliere.entity.Consigliere;
import com.consigliere.service.ConsigliereService;

@CrossOrigin
@Controller
public class ConsigliereController {

	@Autowired
	ConsigliereService consigliereService;

	@GetMapping("/")
	public String welcome(Model model) {
		return "index";
	}

	@GetMapping("/login")
	public ModelAndView logIn(Model model) {
		return new ModelAndView("login", "consigliere", new Consigliere());
	}

	@PostMapping("/login")
	public String handleLogIn(Model model, @ModelAttribute("consigliere") Consigliere consigliere,
			HttpSession session) {
		Consigliere consigliereFromDb = consigliereService.findConsigliereLogIn(consigliere.getEmail(),
				consigliere.getPassword());
		
		model.addAttribute("loggedInConsigliere", consigliereFromDb);
		return "collection";
	}

	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("sign-up", "consigliere", new Consigliere());
	}

	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("consigliere") Consigliere consigliere,
			HttpSession session) {
		model.addAttribute("consigliere");
		consigliereService.saveConsigliere(consigliere);
		return "thank-you";
	}

	@GetMapping("/gainers")
	public String gainers(Model model) {
		System.out.println("we ARE HERE");
		model.addAttribute("gainers", consigliereService.fetchGainers());
		return "gainers";
	}

	@PostMapping("/gainers")
	public String handleGainers(Model model, @ModelAttribute("consigliere") Consigliere consigliere,
			HttpSession session) {
		model.addAttribute("consigliere");
		consigliereService.saveConsigliere(consigliere);
		return "gainers";
	}

	@GetMapping("/losers")
	public String losers(Model model) {
		model.addAttribute("losers", consigliereService.fetchLosers());
		return "losers";
	}

	@PostMapping("/losers")
	public String handleLosers(Model model, @ModelAttribute("consigliere") Consigliere consigliere,
			HttpSession session) {
		model.addAttribute("consigliere");
		consigliereService.saveConsigliere(consigliere);
		return "losers";
	}

	@GetMapping("/crypto")
	public String crypto(Model model) {
		model.addAttribute("crypto", consigliereService.fetchCrypto());
		return "crypto";
	}

	@PostMapping("/crypto")
	public String handleCrypto(Model model, @ModelAttribute("consigliere") Consigliere consigliere,
			HttpSession session) {
		model.addAttribute("consigliere");
		consigliereService.saveConsigliere(consigliere);
		return "crypto";
	}

	@GetMapping("/thankyou")
	public String thankyou(Model model) {
		return "thankyou";
	}

	@GetMapping("/collection")
	public String get(Model model) {
		List<Consigliere> consigliere = consigliereService.getConsigliere();
		model.addAttribute("consigliere", consigliere);
		return "collection";
	}

}