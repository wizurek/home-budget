package pl.edu.wszib.jwd.homebudget.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeBudgetController {

    @Value("${app.title.select}")
    private String title;

    @GetMapping("/enter")
    public String enterYourBudget(Model model) {

        model.addAttribute("title", title);
        return "enter";
    }
}
