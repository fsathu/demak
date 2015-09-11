package serviceImpl;

import com.dk.model.User;

/**
 * Created by fredrick on 8/18/15.
 */
public interface UserService {

    User findUserbyEmailandPassword(String email, String password);
}
