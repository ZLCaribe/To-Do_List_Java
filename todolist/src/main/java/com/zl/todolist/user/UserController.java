package com.zl.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Modifiers:
 * - public;
 * - private;
 * - protected;
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    /**
     * String (text)
     * Integer (int) integer numbers
     * Float (float) floating point numbers e.g 0.0001
     * Double (double) double floating point numbers e.g 0.000001
     * Character (char) e.g A, B, C
     * Date
     * void
     */
    /**
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }
}
