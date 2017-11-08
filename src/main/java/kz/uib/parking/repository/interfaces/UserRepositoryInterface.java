package kz.uib.parking.repository.interfaces;

import java.util.List;
import kz.uib.parking.model.User;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public interface UserRepositoryInterface {

    public void writeUsers(List<User> users);

    public List<User> readUsers();

    public void addOneUserToDB(User user);

    public User findUserById(String id);

    public Boolean isUserInDB(String id);


}
