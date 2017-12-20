package com.hpe.kevin.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hpe.kevin.business.entities.TMGlobalMatch;
import com.hpe.kevin.business.services.MasterDataService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	MasterDataService masterDataService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
//    @ModelAttribute("allGlobalMatch")
//    public List<TMGlobalMatch> populateGlobalMatch() {
//    	List<TMGlobalMatch> result = masterDataService.getAllGlobalMatch();
//    	logger.info("全球赛事数=", result.size());
//        return result;
//    }
    
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		formattedDate = "4点45分38秒";
		
		model.addAttribute("serverTime", formattedDate );
		
		logger.info("serverTime is {}.", formattedDate);
		
		return "home";
	}
	
}
