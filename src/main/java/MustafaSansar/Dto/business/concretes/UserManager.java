package MustafaSansar.Dto.business.concretes;

import MustafaSansar.Dto.business.abstracts.UserService;
import MustafaSansar.Dto.dataAccess.UserDao;
import MustafaSansar.Dto.entities.User;
import MustafaSansar.Dto.entities.dtos.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserManager implements UserService {

    private UserDao userDao;
    private ModelMapper modelMapper;

    public UserManager(UserDao userDao, ModelMapper modelMapper){
        this.userDao = userDao;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<UserDto> findAll() {
        List<User> users = this.userDao.findAll();      // List<User>
        List<UserDto> userDtos = users.stream().map(user -> modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
        return userDtos;
    }
}
