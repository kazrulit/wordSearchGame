package kz.epam.controller;

import kz.epam.model.pattern.ALetterPattern;
import kz.epam.model.pattern.LetterPattern;
import kz.epam.model.word.ClothWord;
import kz.epam.model.word.FocalWord;
import kz.epam.model.word.OctetWord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

/**
 * Created by Khamid_Sarmanov on 12/10/2015.
 */
@Controller
public class MainController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showPuzzle(ModelMap modelMap) {
        try {
            List list = ClothWord.getWord();
            Collections.shuffle(list);
            modelMap.addAttribute("grid", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping(path = "/second", method = RequestMethod.GET)
    public String showSecondPuzzle(ModelMap modelMap) {
        try {
            List list = FocalWord.getWord();
            Collections.shuffle(list);
            modelMap.addAttribute("grid", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping(path = "/third", method = RequestMethod.GET)
    public String showThirdPuzzle(ModelMap modelMap) {
        try {
            List list = OctetWord.getWord();
            Collections.shuffle(list);
            modelMap.addAttribute("grid", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
