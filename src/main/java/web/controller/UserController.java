package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getIndex(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping(value = "/add")
    public String addForm(ModelMap model) {
        model.addAttribute("users", new User());
        return "add";
    }

    @PostMapping(value = "/add")
    public String addSumbit(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @PostMapping(value = "/delete/{id}")
    public String deleteUser(@RequestParam("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editPage(@RequestParam("id") Long id, ModelMap model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String editSubmit(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/";
    }
}
