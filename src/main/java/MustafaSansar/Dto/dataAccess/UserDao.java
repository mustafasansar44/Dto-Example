package MustafaSansar.Dto.dataAccess;

import MustafaSansar.Dto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    List<User> findAll();
}
