package serviceImpl;

import com.dk.model.UserLoginDetails;

import java.util.List;

/**
 * Created by fredrick on 9/20/15.
 */
public interface UserLoginDetailsService {
    public UserLoginDetails save(UserLoginDetails userLoginDetails);
    public UserLoginDetails update(UserLoginDetails userLoginDetails);

    UserLoginDetails findLoginDetailByUserAndmaxId(String email,Long id);

    List<UserLoginDetails> findAll();
}