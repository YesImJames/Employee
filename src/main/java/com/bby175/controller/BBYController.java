package com.bby175.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bby175.model.EoM;
import com.bby175.repository.BBYRepository;



@Controller
public class BBYController {
	
	@Autowired
	BBYRepository bbyRepository;
	
	@GetMapping("/")
	public String signIn (EoM eom, Model model) {
		
		return "eom/landing.html";
	}

	@GetMapping("/vote")
	public String votePage (EoM eom, Model model) {
		ArrayList<EoM> employees = new ArrayList<>();
		employees = (ArrayList<EoM>) this.bbyRepository.findAll();
		
		model.addAttribute("employee", employees);
		
		return "eom/vote.html";
	}
	
	@PostMapping("/vote")
	public String addVote (EoM eom, Model model) {
		this.bbyRepository.save(eom);
		

		model.addAttribute("firstName", eom.getFirstName());
		model.addAttribute("lastName", eom.getLastName());
		model.addAttribute("vote", eom.getVoteAmount());
		
		return "eom/result.html";
	}
	
}
