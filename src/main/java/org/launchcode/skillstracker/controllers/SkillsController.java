package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping
    public static String skillsMenu() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Here are the languages you will learn!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>Python</li>" +
                        "<li>C#</li>" +
                        "</ol>";
        return html;
    }

    @GetMapping("form")
    public static String skillsForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Programming Languages Form</h1>" +
                        "<form action='submitted' method='get'>" +
                        "<div style='display: flex; flex-direction: column'>" +
                        "<label>Name:</label>" +
                        "<input type='text' name='name' style='width: 20%'/>" +
                        "<label>My favorite language:</label>" +
                        "<span><select name='firstLang'>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "<option>C#</option>" +
                        "</select></span>" +
                        "<label>My second favorite language:</label>" +
                        "<span><select name='secondLang'>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "<option>C#</option>" +
                        "</select></span>" +
                        "<label>My third favorite language:</label>" +
                        "<span><select name='thirdLang'>" +
                        "<option>Java</option>" +
                        "<option>Python</option>" +
                        "<option>C#</option>" +
                        "</select></span>" +
                        "<span><input type='submit' value='Submit' /></span>" +
                        "</div>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "submitted")
    public static String formSubmitted(@RequestParam String name, String firstLang, String secondLang, String thirdLang) {
        return
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + firstLang + "</li>" +
                        "<li>" + secondLang + "</li>" +
                        "<li>" + thirdLang + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
    }
}





