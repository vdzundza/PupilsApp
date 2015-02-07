package com.jony.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jony.model.Pupils;
import com.jony.sevice.PupilsService;

@Controller
public class PupilsController {
	@Autowired
	private PupilsService pupilsService;
	
	public String setupForm(Map<String,Object> map){
		Pupils pupils = new Pupils();
		map.put("pupils", pupils);
		map.put("pupilsList", pupilsService.getAllPupils());
		return "pupils";
	}
	@RequestMapping(value="/pupils.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Pupils pupils,BindingResult result, @RequestParam String action, Map<String,Object> map){
		
	Pupils 	pupilsResult = new Pupils();
	switch(action.toLowerCase()){
		case"add":
			pupilsService.add(pupils);
			pupilsResult = pupils;
			break;
		case "edit":
			pupilsService.edit(pupils);
			pupilsResult = pupils;
			break;
		case"delete":
			pupilsService.delete(pupils.getPupilsId());
			pupilsResult = new Pupils();
			break;
		case"search":
			Pupils searchedPupils = pupilsService.getPupils(pupils.getPupilsId());
			pupilsResult = searchedPupils != null? searchedPupils : new Pupils();
			break;
	}
	map.put("pupils", pupilsResult);
	map.put("pupilsList", pupilsService.getAllPupils());
	return "pupils";
	}
}
