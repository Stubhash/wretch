//package controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import com.wretch.wretchmaven.model.User;
//
//import com.wretch.wretchmaven.service.UserService;
//
//import validator.UserValidator;
//@Controller
//public class UserController {
//    @Autowired
//    private UserService userService;
//
////    @Autowired
////    private SecurityService securityService;
//
//    @Autowired
//    private UserValidator userValidator;
//
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
//        userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        userService.save(userForm);
//
////        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//        return "/tradingpage.html";
//    }
//
//  
//    @GetMapping("/index")
//    public String welcome(Model model) {
//        return "index";
//    }
//}
//
