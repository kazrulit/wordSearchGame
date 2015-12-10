package kz.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Khamid_Sarmanov on 12/10/2015.
 */
@Controller
public class MainController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showPuzzle(ModelMap modelMap) {
        try {
            //modelMap.addAttribute("grid", gameService.getWordGrid("ac"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
