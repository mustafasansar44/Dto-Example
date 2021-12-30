package MustafaSansar.Dto.entities.dtos;
import MustafaSansar.Dto.entities.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private List<Post> posts;

}
