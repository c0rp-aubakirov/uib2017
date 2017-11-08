package kz.uib.parking.repository;

import kz.uib.parking.model.User;
import kz.uib.parking.repository.interfaces.UserRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class JsonFileUserRepository extends JsonRepository<User> implements UserRepositoryInterface {

    public JsonFileUserRepository(final String filename) {
        super(filename);
    }

    @Override
    public User findUserByPhoneNumber(final String phoneNumber) {
        throw new UnsupportedOperationException("#findUserByPhoneNumber()");
    }
}
