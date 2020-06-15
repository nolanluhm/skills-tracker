package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsController {

    @GetMapping
    public String languageOptions() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String rankLanguages() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/form'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +

                "<label>My favorite language:</label><br>" +
                "<select name='firstLanguage' id='firstLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +

                "<label>My second favorite language:</label><br>" +
                "<select name='secondLanguage' id='secondLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +

                "<label>My third favorite language:</label><br>" +
                "<select name='thirdLanguage' id='thirdLanguage'><br>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "</select><br>" +

                "<button type='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formSubmission(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</body>" +
                "</html>";
    }

}
