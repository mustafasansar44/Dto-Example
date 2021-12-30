package MustafaSansar.Dto.api;

import MustafaSansar.Dto.business.abstracts.UserService;
import MustafaSansar.Dto.entities.User;
import MustafaSansar.Dto.entities.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<UserDto> findAll() {
        return this.userService.findAll();
    }

}
