package kz.uib.parking.repository.interfaces;

import java.util.List;
import kz.uib.parking.model.User;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public interface UserRepositoryInterface extends RepositoryInterface<User> {

    public User findUserByPhoneNumber(String phoneNumber);

}
