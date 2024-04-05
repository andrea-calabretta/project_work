package org.example.project_work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "math")
public class MathController {

    @PostMapping(path = "/add")
    public @ResponseBody float add(@RequestParam float num1, @RequestParam float num2){
        float result = num1 + num2;
        return result;
    }
}
