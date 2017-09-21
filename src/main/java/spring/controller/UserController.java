package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.entity.User;
import spring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
/*

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping(path = "user")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.findAll() ,HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping(path = "user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id) {
        return new ResponseEntity<>(userService.findById(id) ,HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping(path = "user/")
    public ResponseEntity<List<User>> getUsersByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(userService.findByName(name) ,HttpStatus.OK);
    }
*/

}
