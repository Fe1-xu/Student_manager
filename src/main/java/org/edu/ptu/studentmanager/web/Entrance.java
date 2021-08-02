package org.edu.ptu.studentmanager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Lin Chenxiao on 2021-05-25
 **/
@Controller
public class Entrance {
    @GetMapping({"/", "/student"})
    public String student() {
        return "student.html";
    }

    @GetMapping("/major")
    public String major() {
        return "major.html";
    }

    @GetMapping("/course")
    public String course() {
        return "course.html";
    }
}
