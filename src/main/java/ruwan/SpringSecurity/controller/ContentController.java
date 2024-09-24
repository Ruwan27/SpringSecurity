package ruwan.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {
    @GetMapping("/home")
    public String HanleWelcome() {
        return "home";
    }
    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "home_user";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "custom_login";
    }
    @GetMapping("/logout")
    public String logoutPage() {
        return "logout";  // Return view for the logout confirmation page
    }
    @GetMapping("/register/user")
    public String showRegisterPage() {
        //model.addAttribute("user", new MyUser());  // Send an empty MyUser object to the form
        return "register";  // This refers to register.html in the templates folder
    }

}
