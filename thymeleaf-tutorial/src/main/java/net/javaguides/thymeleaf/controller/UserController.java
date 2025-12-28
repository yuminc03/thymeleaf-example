package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // handler method to handle variable-expression request
    // http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Ramesh", "ramesh@gamil.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handler method to handle selection-expression
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Ramesh", "ramesh@gamil.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handler method to handle message expressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    // handler method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    @GetMapping("fragment-expression")
    // http://localhost:8080/fragment-expression
    // handler method to handle fragment expression
    public String fragmentExpression() {
        return "fragment-expression";
    }

    // http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gamil.com", "ADMIN", "Male");
        User ramesh = new User("Ramesh", "ramesh@gamil.com", "USER", "Male");
        User meena = new User("Meena", "meena@gamil.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(meena);
        model.addAttribute("users", users);
        return "users";
    }

    // http://localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin", "admin@gamil.com", "ADMIN", "Male");
        User ramesh = new User("Ramesh", "ramesh@gamil.com", "USER", "Male");
        User meena = new User("Meena", "meena@gamil.com", "USER", "Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(meena);
        model.addAttribute("users", users);
        return "if-unless";
    }

    // http://localhost:8080/switch-case
    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User user = new User("Ramesh", "remesh@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "switch-case";
    }

    // MARK: - Practice

    // 예약 확정 상세
    // http://localhost:8080/practice/reserv-confirm-details
    @GetMapping("/practice/reserv-confirm-details")
    public String reservConfirmDetails() {
        return "reserv-confirm-details";
    }
}
