package serviceImpl;


import com.dk.dao.UserDao;
import com.dk.dao.daoImpl.UserDaoImpl;
import com.dk.model.User;

/**
 * Created by fredrick on 8/18/15.
 */
public class UserServiceImpl implements UserService {
    UserDao userDao= new UserDaoImpl();

    public User findUserbyEmailandPassword(String email, String password) {
       return userDao.findUserbyEmailandPassword(email, password);

    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
