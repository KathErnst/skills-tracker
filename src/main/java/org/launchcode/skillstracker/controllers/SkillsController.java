package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String welcome(){
        String html;
        html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are the skills to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping ("form")
    @ResponseBody
    public String renderForm (){
        String html;
        html = "<html>" +
                "<body>" +
                "<h2>Choose your preferences:</h1>" +
                "<form action = '/form' method = 'post'>" +
                "<label> Name: " +
                "<input type = 'text' name = 'name'>" +
                "<br>" +
                "<label> Favorite Language: " +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label> Second Favorite Language: " +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label> Third Favorite Language: " +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>Javascript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    @ResponseBody
    public String completedForm(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice){
        return"<html>" +
                "<body>" +
                "<h1>Great work!</h1>" +
                "<p>" +
                name +
                ", here's your to-do list: " +
                "</p>" +
                "<br>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
