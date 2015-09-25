package serviceImpl;

import com.dk.dao.UserLoginDetailsDao;
import com.dk.dao.daoImpl.UserLoginDetailsDaoImpl;
import com.dk.model.UserLoginDetails;

import java.util.List;

/**
 * Created by fredrick on 9/20/15.
 */
public class UserLoginDetailsServiceImpl implements UserLoginDetailsService {
UserLoginDetailsDao userLoginDetailsDao=new UserLoginDetailsDaoImpl();
    @Override
    public UserLoginDetails save(UserLoginDetails userLoginDetails) {
        return userLoginDetailsDao.save(userLoginDetails);
    }

    @Override
    public UserLoginDetails update(UserLoginDetails userLoginDetails) {
        return userLoginDetailsDao.update(userLoginDetails);
    }

    @Override
    public UserLoginDetails findLoginDetailByUserAndmaxId(String email,Long id) {
        return userLoginDetailsDao.findLoginDetailByUserAndmaxId(email,id);
    }

    @Override
    public List<UserLoginDetails> findAll() {
        return userLoginDetailsDao.findAll();
    }
}

