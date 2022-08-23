package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping()
    public String skillsList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are some skills you can learn:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>CircuitPython</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String getList(@RequestParam String name, String favorite, String secondfavorite, String thirdfavorite) {
        return "<html>" +
                "<body>" +
                "<table>" +
                "<tr>" +
                "<td>" + name + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Favorite</td>" +
                "<td>" + favorite + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Second Favorite</td>" +
                "<td>" + secondfavorite + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Third Favorite</td>" +
                "<td>" + thirdfavorite + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/form'>" +
                "<label for='name'>Name:</label>" +
                "<input type='text' name='name'>" +
                "</br>" +
                "<label for='favorite'>My favorite language:</label>" +
                "<select name='favorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='circuitpython'>CircuitPython</option>" +
                "</select>" +
                "</br>" +
                "<label for='second favorite'>My second favorite language:</label>" +
                "<select name='secondfavorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='circuitpython'>CircuitPython</option>" +
                "</select>" +
                "</br>" +
                "<label for='third favorite'>My third favorite language:</label>" +
                "<select name='thirdfavorite'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='circuitpython'>CircuitPython</option>" +
                "</select>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
