package com.project.nyvia380.common.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/message")
    public ModelAndView displayUserMessage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",userService.getUserMessage());
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @PutMapping("/insertUser")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/findUser/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.getUser(id);
    }




}
