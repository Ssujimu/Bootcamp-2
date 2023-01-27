package org.example.user.endpoint;

import org.example.user.aggregate.User;
import org.example.user.command.UserCreate;
import org.example.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserEndpoint {
    private final UserService userService;


    public UserEndpoint(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    // RequestParams = url ?뒤에 오는
    public void create(@RequestBody UserCreate command) {
        this.userService.create(command);
    }

    @GetMapping("/{id}")
    public User query(@PathVariable String id) {
        return this.userService.query(id);
    }
}
