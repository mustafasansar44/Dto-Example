package MustafaSansar.Dto.business.abstracts;

import MustafaSansar.Dto.entities.User;
import MustafaSansar.Dto.entities.dtos.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
}
